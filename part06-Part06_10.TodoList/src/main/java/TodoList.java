
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks = new ArrayList<>();

    //constructor for class "ToDoList"
    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    //method that adds new task to the list of tasks
    public void add(String task) {
        this.tasks.add(task);
    }

    //method that prints out the given tasks
    public void print() {
        int countNumber = 1;
        for (int i = 0; i < this.tasks.size(); i++) {
            System.out.println(countNumber + ": " + this.tasks.get(i));
            countNumber++;
        }
    }

    //removes the selected task from the list
    public void remove(int number) {
        this.tasks.remove(number - 1);
    }
}
