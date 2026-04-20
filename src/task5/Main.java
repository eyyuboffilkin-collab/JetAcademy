package task5;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Account account = new Account("ACC123", 1000);
        Card card = new Card("CARD123", 1234, account);
        Atm atm = new Atm(5000);


        Scanner sc = new Scanner(System.in);
        atm.insertCard(card);

        System.out.println("PIN daxil et: ");
        int pin = sc.nextInt();
        atm.enterPin(pin);

        while(true){
            System.out.println("\n---MENU---");
            System.out.println("1. Balance yoxla");
            System.out.println("2. Pul cixart");
            System.out.println("3. Karti cixart (exit)");
            System.out.println("Secim:");

            int choice = sc.nextInt();

            if(choice == 1){
                atm.checkBalance();
            } else if (choice == 2) {

                System.out.println("Meblegi daxil et: ");
                double amount = sc.nextDouble();
                atm.withdraw(amount);
            }else if(choice == 3){
                atm.ejectCard();
                break;
            }
            else{
                System.out.println("Yanlis secim");
            }
        }
        sc.close();

//        atm.insertCard(card);
//        atm.enterPin(1234);
//        atm.checkBalance();
//        atm.withdraw(100);
//        atm.checkBalance();
//        atm.ejectCard();


    }
}