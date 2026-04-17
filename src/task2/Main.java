package task2;

public class Main {
    static void main(String[] args) {
    Book b1 = new Book("Cerpeleng", 200, 10.99);
    Library l1 = new Library("Menim kitabxanam");
    l1.setBooks(b1);
        System.out.println(l1);
    }
}
