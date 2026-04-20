package task5;

public class Atm {
    double cashAvailable;
    Card currentCard;
    boolean isAuthenticated = false;

    public Atm(double cashAvailable) {
        this.cashAvailable = cashAvailable;
    }

    public void insertCard(Card card) {
        this.currentCard = card;
        isAuthenticated = false;
        System.out.println("Kart daxil edildi");

    }

    public void enterPin(int pin) {
        if (currentCard != null && currentCard.validatePin(pin)) {
            isAuthenticated = true;
            System.out.println("Ugurla daxil oldunuz");
        } else {
            System.out.println("Pin sehvdir");
        }

    }

    public void checkBalance() {
        if (isAuthenticated) {
            System.out.println("Balans: " + currentCard.getAccount().getBalance());
        } else {
            System.out.println("Evvel pin daxil et");
        }
    }

    public void withdraw(double amount) {
        if (!isAuthenticated) {
            System.out.println("Evvel pin daxil et");
            return;
        }
        Account acc = currentCard.getAccount();

        if (amount > cashAvailable) {
            System.out.println("ATM-de kifayet qeder balans yoxdur");
        } else if (amount > acc.getBalance()) {
            System.out.println("Hesabda kifayet qeder balans yoxdur");
        } else {
            acc.withdraw(amount);
            cashAvailable -= amount;
            System.out.println("Pul verildi: " + amount);
        }

    }

    public void ejectCard() {
        currentCard = null;
        isAuthenticated = false;
        System.out.println("Kart cixarildi");
    }

}
