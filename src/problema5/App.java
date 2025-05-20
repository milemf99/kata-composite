package problema5;

public class App {
    public static void main(String[] args) {
        Task escribirCodigo = new Task("Escribir código", 2);
        Task revisarCodigo = new Task("Revisar código", 1);

        TaskGroup desarrollo = new TaskGroup("Desarrollo");
        desarrollo.addTask(escribirCodigo);
        desarrollo.addTask(revisarCodigo);

        desarrollo.showDetails();
    }
}
