package animal;

abstract class Animal implements AnimalActions {
    String name;

    Animal(String name){
        this.name = name;
    }

    void sleep(){
        System.out.println(name + "is sleeping...");
    }
    abstract void makeSound();
}
