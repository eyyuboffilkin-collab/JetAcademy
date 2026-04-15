package payment;

public class CreditCardPayment extends Payment{
    CreditCardPayment(String accountHolder){
        super(accountHolder);
    }
    @Override
    public void pay(double amount){
        validate();
        System.out.println("Paid " + amount + " using Credit Card");
        printReceipt(amount);
    }
    @Override
    public void refund(double amount){
        System.out.println("Refunded " + amount + " to Credit Card");
    }
    @Override
    void validate(){
        System.out.println("Validating credit card...");
    }
}
