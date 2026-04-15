package interfacetask;

public class Eagle extends Animal implements Ability{
    Eagle(String name) {
        super(name);
    }

    @Override
    public void useAbility() {
        System.out.println("Eagle hunts from sky");

    }

    @Override
    void makeSound() {
        System.out.println("Eagle screeches");

    }
}
