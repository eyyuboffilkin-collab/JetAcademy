package bank;

public class PashaBank implements Payment{
    @Override
    public void pay() {
        System.out.println("Pasha Bank karti ile odenildi");
    }
}
