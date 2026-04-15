package interfacetask;

public class Main {
    static void main(String[] args) {
        Animal a1 = new Eagle("Eagle");
        Animal a2 = new Tiger("Tiger");

        a1.makeSound();
        a2.makeSound();

        System.out.println("--------------");

        ((Ability)a1).useAbility();

        ((Ability)a2).useAbility();

    }
}
