package task6;

public class MySQLDatabase implements DataBase{
    @Override
    public void connect() {
        System.out.println("MySQL connected...");
    }
}
