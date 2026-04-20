package task4;

public class Email implements Notification{


    @Override
    public void sendmessage(String to, String subject) {
        System.out.println("Mesaj email vasitesile " + to +" -a"  + " gonderildi");


    }
}
