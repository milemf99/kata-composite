package problema5;

import java.util.ArrayList;
import java.util.List;

public class TaskGroup implements TaskComponent {

    private String name;
    private List<TaskComponent> tasks = new ArrayList<>();

    public TaskGroup(String name) {
        this.name = name;
    }

    public void addTask(TaskComponent task) {
        tasks.add(task);
    }

    @Override
    public int getTime() {
        int total = 0;
        for (TaskComponent task : tasks) {
            total += task.getTime();
        }
        return total;
    }

    @Override
    public void showDetails() {
        for (TaskComponent task : tasks) {
            task.showDetails();
        }
        System.out.println("Grupo de Tareas: " + name + ", Tiempo Total: " + getTime() + " horas");
    }
    
}
