package task2;

import java.util.Arrays;

public class Library {
    String name;
    Book[]books = new Book[5];

    public void setBooks(Book books) {
        this.books = new Book[]{books};
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }

    public Library(String name) {
        this.name = name;

    }
}
