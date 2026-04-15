package employee;

public class Designer extends Employee implements Workable {
    Designer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void calculateBonus() {
        System.out.println(salary * 0.1);

    }

    @Override
    public void work() {
        System.out.println("Designer is designing");

    }
}
