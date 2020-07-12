
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private BirdDatabase birdsDatabase;

    public UserInterface(Scanner scanner, BirdDatabase database) {
        this.scanner = scanner;
        this.birdsDatabase = database;
    }

    public void start() {
        while (true) {
            System.out.println("?");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                add();
            } else if (command.equals("Observation")) {
                observation();
            } else if (command.equals("One")) {
                printOneBird();
            } else if (command.equals("All")) {
                printAllBirds();
            } else {
                System.out.println("Unknown command!");
            }
        }
    }

    //method that assks for the user input
    public String askUserInput(String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextLine();
    }

    //method that adds a new Bird object to the database of birds
    public void add() {
        //user inputs the bird name and name in Latin
        String birdName = askUserInput("Name: ");
        String birdLatinName = askUserInput("Name in Latin: ");
        //adds new Bird to the database
        this.birdsDatabase.addBird(birdName, birdLatinName);
    }

    //method that adds an observation to searhed bird
    public void observation() {
        String birdName = askUserInput("Name: ");

        //if birds is found in the list, an observation is added, othervise the program prints out the message
        boolean isFound = this.birdsDatabase.observation(birdName);
        if (!isFound) {
            System.out.println(birdName + " is not a bird!");
        }
    }

    //method that prinst out the one bird from the database of birds
    public void printOneBird() {
        //asks user for the name of the bird and gets the bird from the database
        String birdName = askUserInput("Name: ");
        String birdToPrint = this.birdsDatabase.getOne(birdName);
        //checks if the searched bird is in the database - if yes prints it out, otherwise program prints out the message
        if (birdToPrint == null) {
            System.out.println(birdName + " is not a bird!");
        } else {
            System.out.println(birdToPrint);
        }
    }
    
    //method that prinst out all birds from the database of birds
    public void printAllBirds() {
        System.out.println(this.birdsDatabase.getAllBirds());
    }
}
