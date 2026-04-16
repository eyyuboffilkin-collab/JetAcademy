package bank;

public class AbbBank implements Payment{
    @Override
    public void pay() {
        System.out.println("Abb karti vasitesile odenildi");
    }
}
