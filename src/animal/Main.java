package animal;

public class Main {
    static void main(String[] args) {
        Animal a1 = new Bird("Eagle");
        Animal a2 = new Fish("Demo");

        a1.eat();
        a1.makeSound();
        a1.sleep();
        a1.move();


        System.out.println("----------");

        a2.eat();
        a2.makeSound();
        a2.sleep();
        a2.move();



    }


}










