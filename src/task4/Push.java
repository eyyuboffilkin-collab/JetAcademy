package task4;

public class Push implements Notification{
    @Override
    public void sendmessage(String to, String subject) {
        System.out.println("Mesaj gonderildi");
    }
}
