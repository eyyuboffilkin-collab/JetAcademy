package payment;

public class Main {
    static void main(String[] args) {
        Payment p1 = new CreditCardPayment("Ilkin");
        Payment p2 = new PayPalPayment("Cicek");

        p1.pay(100);
        System.out.println("------");
        p2.pay(200);
    }

}
