package DB;

import java.util.ArrayList;

public class DBManager {
    private static final ArrayList<Task> tasks = new ArrayList<>();

    private static int id = 4;

    static {
        tasks.add(new Task(1, "Run", "Run 1km", "2023-04-16", "Да"));
        tasks.add(new Task(2, "Read", "Read 10 pages", "2023-04-18", "Нет"));
        tasks.add(new Task(3, "Write", "Write 1 essay", "2023-04-17", "Да"));
    }

    public static ArrayList<Task> getTasks(){
        return tasks;
    }

    public static void addTask(Task task){
        task.setId(id);
        tasks.add(task);
        id++;
    }

    public static Task getTask(int id){
        return tasks.stream().filter(task -> task.getId()==id).findFirst().orElse(null);
    }

    public static void updateTask(Task task){
        for (int i = 0; i < tasks.size(); i++){
            if(tasks.get(i).getId() == task.getId()){
                tasks.set(i, task);
                break;
            }
        }
    }

    public static void deleteTask(int id){
        for(int i = 0; i < tasks.size(); i++){
            if(tasks.get(i).getId() == id){
                tasks.remove(i);
                break;
            }
        }
    }
}
