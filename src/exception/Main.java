package exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    AuthService authService = new AuthService();

    int attempts = 0;

    while(attempts < 3){
        try{
            System.out.print("Username: ");
            String username = sc.nextLine();

            System.out.print("Password: ");
            String password = sc.nextLine();

            authService.login(username, password);
            break;
        }catch (UserNotFoundException |
        WrongPasswordException |
        IllegalArgumentException e){
            System.out.println(e.getMessage());
            attempts++;
        }
    }
    if(attempts == 3){
        System.out.println("Account blocked!");
    }


    }
}
