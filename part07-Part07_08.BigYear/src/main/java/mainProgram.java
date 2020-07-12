/*
In this exercise you will design and implement a database for bird-watchers. 
The database contains birds, each of which has a name (string) and a name in Latin (string). 
The database also counts the observations of each bird.

The program must implement the following commands:
Add - adds a bird
Observation - adds an observation
All - prints all birds
One - prints one bird
Quit - ends the program
Incorrect input must also be handled.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BirdDatabase birdsDatabase = new BirdDatabase();

        UserInterface ui = new UserInterface(scanner, birdsDatabase);
        ui.start();

    }
}
