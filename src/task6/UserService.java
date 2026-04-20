package task6;

public class UserService {
    private DataBase database;

    public UserService(DataBase dataBase) {
        this.database = dataBase;
    }
    public void saveUser(){
        database.connect();
        System.out.println("User saved");
    }
}
