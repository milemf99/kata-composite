import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private List<Employee> subordinates = new ArrayList<>();

    public Manager(String name) {
        this.name = name;
    }

    public void addSubordinate(Employee e) {
        subordinates.add(e);
    }

    @Override
    public double getSalary() {
        double total = 0;
        for (Employee e : subordinates) {
            total += e.getSalary();
        }
        return total;
    }

    @Override
    public void showDetails() {
        System.out.println("Gerente: " + name + ", Salario Total: $" + getSalary());
        for (Employee e : subordinates) {
            e.showDetails();
        }
    }
}
