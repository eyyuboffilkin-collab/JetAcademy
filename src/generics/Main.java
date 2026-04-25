package generics;

public class Main {
    static void main(String[] args) {
     SmartStorage<Integer> numbers = new SmartStorage<>();
     numbers.add(10);
     numbers.add(5);
     numbers.add(20);
     numbers.add(15);

     numbers.printAll();
        System.out.println("MAX: " + numbers.getMax() );

        System.out.println("-----------------");

        SmartStorage<String> words = new SmartStorage<>();
        words.add("Java");
        words.add("Python");
        words.add("Java");

        words.printAll();
        System.out.println("MAX: " + words.getMax());

        }

    }
