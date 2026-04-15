package payment;

public class PayPalPayment extends Payment{
    PayPalPayment(String accountHolder) {
        super(accountHolder);
    }

    @Override
    void validate() {
        System.out.println("Logging into PayPal account...");

    }

    @Override
    public void pay(double amount) {
        validate();
        System.out.println("Paid " + amount + " using PayPal");
        printReceipt(amount);

    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to PayPal");

    }
}
