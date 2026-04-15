package employee;

public class Developer extends Employee implements Workable {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void calculateBonus() {
        System.out.println(salary * 0.2);

    }

    @Override
    public void work() {

        System.out.println("Developer is coding");
    }
}
