package interfacetask;

public class Tiger extends Animal implements Ability{
    Tiger(String name) {
        super(name);
    }

    @Override
    public void useAbility() {
        System.out.println("Tiger hunts on land");

    }

    @Override
    void makeSound() {
        System.out.println("Tiger roars ");

    }
}
