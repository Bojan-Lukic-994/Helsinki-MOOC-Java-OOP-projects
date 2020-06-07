
import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    //constructor for class "UserInterface"
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    //method that starts the program
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = this.scanner.nextLine();

            //loop breaks if given command is stop
            if (command.equals("stop")) {
                break;
            }

            //performs method depending on user 
            if (command.equals("add")) {
                add();
            }
            if (command.equals("list")) {
                list();
            }
            if (command.equals("remove")) {
                remove();
            }
        }
    }

    //mtehod that adds new task to the list
    public void add() {
        System.out.println("To add: ");
        String taskToAdd = this.scanner.nextLine();
        this.list.add(taskToAdd);
    }

    //method that prints out all the tasks in the list
    public void list() {
        this.list.print();
    }

    //method that removes selcted task from the list
    public void remove() {
        System.out.println("Which one is removed? ");
        int taskToRemove = Integer.valueOf(this.scanner.nextLine());
        this.list.remove(taskToRemove);
    }
}
