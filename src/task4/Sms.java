package task4;

public class Sms implements Notification{
    @Override
    public void sendmessage(String to, String subject) {
        System.out.println("Mesaj sms vasitesile " + to + "e" +  " gonderildi" + " Movzu:" + subject);
    }
}
