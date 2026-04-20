package task5;

public class Account {
    String accountNumber;
    double balance;
    boolean isBlocked = false;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Balans kifayet deyil");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void blockAccount() {
        isBlocked = true;
    }
}

