package calculate;

public class Main {
    static void main(String[] args) {
        Topla topla = new Topla();
        Calculate cixma = new Cixma();
        Calculate vurma = new Vurma();
        Calculate bolme = new Bolme();
        System.out.println(topla.hesablama(3,6));
        System.out.println(cixma.hesablama(10,5));
        System.out.println(vurma.hesablama(5,10));
        System.out.println(bolme.hesablama(15,5));


        }
}
