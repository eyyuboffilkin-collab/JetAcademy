package employee;

public class Main {
    static void main(String[] args) {
        Employee[] employees = {
                new Developer("Ilkin", 1000),
                new Designer("Cicek", 800)
        };

        for (Employee e : employees) {
            ((Workable) e).work();
            e.calculateBonus();
        }
    }
}
