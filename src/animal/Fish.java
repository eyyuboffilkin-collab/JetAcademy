package animal;

public class Fish extends Animal{
    Fish(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " makes no sound");

    }

    @Override
    public void eat() {
        System.out.println(name + " eats food");

    }

    @Override
    public void move() {
        System.out.println(name + " swims");

    }
}
