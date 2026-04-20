package task5;

public class Card {
    String cardNumber;
    int pin;
    Account account;
    boolean isActive = true;
    int attempts = 0;

    public Card(String cardNumber, int pin, Account account) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.account = account;

    }

    public boolean validatePin(int inputPin) {
        if (!isActive) {
            System.out.println("Kart bloklanib");
            return false;
        }
        if (inputPin == pin) {
            attempts = 0;
            return true;
        } else {
            attempts++;
            System.out.println("Pin yanlisdir");
        }
        if (attempts > 3) {
            blockCard();
            System.out.println("Kard bloklandi");
        }
        return false;
    }

    public Account getAccount() {
        return account;
    }

    public void blockCard() {
        isActive = false;
    }
}

