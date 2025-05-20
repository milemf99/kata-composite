package problema5;

public class Task implements TaskComponent {
    
    private String name;
    private int time;

    public Task(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public int getTime() {
        return time;
    }

    @Override
    public void showDetails() {
        System.out.println("Tarea: " + name + ", Tiempo: " + time + " horas");
    }
    
}
