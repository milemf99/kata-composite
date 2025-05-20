package problema3;
public class Main {
    public static void main(String[] args) {
        // Empleados individuales
        Employee john = new IndividualEmployee("John", 1000);
        Employee jane = new IndividualEmployee("Jane", 1200);

        // Gerente que tiene subordinados
        Manager alice = new Manager("Alice");
        alice.addSubordinate(john);
        alice.addSubordinate(jane);

        // Mostrar detalles
        john.showDetails();
        jane.showDetails();
        alice.showDetails();
    }
}
