package bank;

public class KapitalBank implements Payment{

    @Override
    public void pay() {
        System.out.println("Kapital Bank karti ile odenildi");
    }
}
