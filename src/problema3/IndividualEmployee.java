package problema3;
public class IndividualEmployee implements Employee {
    private String name;
    private double salary;

    public IndividualEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void showDetails() {
        System.out.println("Empleado: " + name + ", Salario: " + salary);
    }
}
