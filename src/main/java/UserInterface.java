
import java.util.Scanner;

public class UserInterface {

    private JokeManager jokesList;
    private Scanner scanner;

    //constructor for class "UserInterface"
    public UserInterface(JokeManager jokesList, Scanner scanner) {
        this.jokesList = jokesList;
        this.scanner = scanner;
    }

    //method that starts the joke manager and manages it
    public void start() {
        while (true) {
            System.out.println("Commands: ");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String input = this.scanner.nextLine();
            //program ends if user inputs "X"
            if (input.equals("X")) {
                break;
            }
            
            //asks the user for a joke and adds it to the manager
            if (input.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String joke = this.scanner.nextLine();
                this.jokesList.addJoke(joke);
            }

            //draws a radnom joke from the manager
            if (input.equals("2")) {
                System.out.println(this.jokesList.drawJoke());
            }

            //prints out all jokes in the manager
            if (input.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokesList.printJokes();
            }
        }
    }
}
