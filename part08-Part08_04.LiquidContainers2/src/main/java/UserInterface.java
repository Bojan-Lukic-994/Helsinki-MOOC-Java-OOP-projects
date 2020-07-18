
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Container first;
    private Container second;

    //constructor for class UserInterface
    public UserInterface(Scanner scanner, Container first, Container second) {
        this.scanner = scanner;
        this.first = first;
        this.second = second;
    }

    //method that starts the program
    public void start() {
        while (true) {
            System.out.print("> ");

            //inputs the given command and amount
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            //splits the user input into pieces (first - command, second - amount)
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            //input "quit" - stops the program
            if (command.equals("quit")) {
                break;
                //input "add" - adds amount to the first container
            } else if (command.equals("add")) {
                first.add(amount);
                System.out.println("First: " + first.toString());
                System.out.println("Second: " + second.toString());
                //input "remove" - removes the amount from the first container
            } else if (command.equals("remove")) {
                first.remove(amount);
                System.out.println("First: " + first.toString());
                System.out.println("Second: " + second.toString());
                //input "move" - moves the amount from first to second container
            } else if (command.equals("move")) {
                first.remove(amount);
                second.add(amount);
                System.out.println("First: " + first.toString());
                System.out.println("Second: " + second.toString());
            }
        }
    }
}
