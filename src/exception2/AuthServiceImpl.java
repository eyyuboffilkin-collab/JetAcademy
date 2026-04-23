package exception2;

public class AuthServiceImpl implements AuthService{
    private  User user = new User("admin", "12345");
    @Override
    public void login(String username, String password) throws UserNotFoundException, WrongPasswordException {

        if(username == null || username.isEmpty() ||
        password == null || password.isEmpty()){
            throw new IllegalArgumentException("Bos ola bilmez");
        }

        if(!username.equals(user.getUsername())){
            throw  new UserNotFoundException("User tapilmadi");
        }
        if(!password.equals(user.getPassword())){
            throw new WrongPasswordException("Sifre sehvdir");
        }
            System.out.println("Login ugurludur");
    }
}
