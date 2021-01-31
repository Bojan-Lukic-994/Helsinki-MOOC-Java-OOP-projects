import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list = new ArrayList<>();

    //constructor for class "ToDoList" - it has no parameters
    public TodoList() {
        this.list = new ArrayList<>();
    }

    //method that adds a new task to the list of tasks
    public void add(String task) {
        this.list.add(task);
    }

    //method that prints out the exercises
    public void print() {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println((i + 1) + ": " + this.list.get(i));
        }
    }

    //method that removes the selected task from the list
    public void remove(int number) {
        this.list.remove(number - 1);
    }
}

