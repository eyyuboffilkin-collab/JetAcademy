package exception2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AuthService auth = new AuthServiceImpl();

        int attempts = 0;

        while(attempts < 3){
            try{
                System.out.print("Username: ");
                String username = sc.nextLine();

                System.out.print("Password: ");
                String password = sc.nextLine();

                auth.login(username, password);
                break;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        if(attempts == 3){
            System.out.println("Account blocked");
        }

    }
}
