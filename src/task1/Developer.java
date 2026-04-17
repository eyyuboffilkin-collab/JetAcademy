package task1;

import java.util.Arrays;

public class Developer {
    String name;
    String surname;
    int expYear;
    String[] pl;

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", expYear=" + expYear +
                ", pl=" + Arrays.toString(pl) +
                '}';
    }

    public Developer(String name, String surname, int expYear, String[] pl) {
        this.name = name;
        this.surname = surname;
        this.expYear = expYear;
        this.pl = pl;
    }
}
