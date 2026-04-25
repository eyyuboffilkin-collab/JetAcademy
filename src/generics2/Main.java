package generics2;

public class Main {
    static void main(String[] args) {
        Inventory<Book>bookInventory = new Inventory<>();
        bookInventory.addItem(new Book("Java Basics",15.5));
        bookInventory.addItem(new Book("OOP Mastery",20));

        Inventory<Phone>phoneInventory = new Inventory<>();
        phoneInventory.addItem(new Phone("iPhone 13",1500));
        phoneInventory.addItem(new Phone("Samsung S21",1200));

        System.out.println("Book:");
        bookInventory.printItems();

        System.out.println("\nPhone:");
        phoneInventory.printItems();
    }
}
