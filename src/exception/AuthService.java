package exception;

public class AuthService {
    private final String correctUsername = "admin";
    private final String correctPassword = "12345";

    public void login(String username, String password)
        throws UserNotFoundException, WrongPasswordException{

        if(username == null || username.isEmpty() ||
        password == null || password.isEmpty()){
            throw new IllegalArgumentException("Bos ola bilmez");
        }
        if(!username.equals(correctUsername)){
            throw new UserNotFoundException("User tapilmadi");
        }

        if(!password.equals(correctPassword)){
            throw new WrongPasswordException("Sifre tapilmadi");
        }
        System.out.println("Login ugurludur");
    }



}
