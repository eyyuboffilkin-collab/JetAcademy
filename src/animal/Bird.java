package animal;

public class Bird extends Animal{

    Bird(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println(name + " eats seeds");
    }

    @Override
    public void move(){
        System.out.println(name + " flies");
    }

    @Override
    void makeSound(){
        System.out.println(name + " chirps");
    }
}
