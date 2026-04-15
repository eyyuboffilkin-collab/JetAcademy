package payment;

abstract class Payment implements PaymentMethod {
    String accountHolder;

    Payment(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    void printReceipt(double amount) {
        System.out.println("Receipt: " + amount + " paid by " + accountHolder);
    }

    abstract void validate();
}
