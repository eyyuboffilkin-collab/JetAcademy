package bank;

public class Main {
    static void main(String[] args) {
        KapitalBank kapitalBank = new KapitalBank();
        AbbBank abbBank = new AbbBank();
        PashaBank pashaBank = new PashaBank();
        kapitalBank.pay();
        abbBank.pay();
        pashaBank.pay();
    }




}
