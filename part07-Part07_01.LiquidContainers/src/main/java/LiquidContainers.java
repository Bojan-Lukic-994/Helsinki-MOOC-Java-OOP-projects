
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //initializes the containers
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            //splits the user input into command add amount
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            //checks if the user wants to add amount to the first container
            if (command.equals("add")) {
                if (amount > 0) {
                    //adds the given amount to the first container
                    if (firstContainer + amount <= 100) {
                        firstContainer += amount;
                    } else {
                        firstContainer = 100;
                    }
                }
                //prints out the values of first and second container
                System.out.println("First: " + firstContainer + "/" + 100);
                System.out.println("Second: " + secondContainer + "/" + 100);
            }

            //checks if the user wants to move amount from first to second container
            if (command.equals("move")) {
                if (amount > 0) {
                    //moves the amount from first container
                    if (firstContainer - amount >= 0) {
                        firstContainer -= amount;
                    } else {
                        firstContainer = 0;
                    }
                    //moves the amount to the second container
                    if (secondContainer + amount <= 100) {
                        secondContainer += amount;
                    } else {
                        secondContainer = 100;
                    }
                }
                //prints out the values of first and second container
                System.out.println("First: " + firstContainer + "/" + 100);
                System.out.println("Second: " + secondContainer + "/" + 100);
            }

            //checks if the user wants to remove amount from the second container
            if (command.equals("remove")) {
                if (amount > 0) {
                    //removes amount from the second container
                    if (secondContainer - amount >= 0) {
                        secondContainer -= amount;
                    } else {
                        secondContainer = 0;
                    }
                }
                //prints out the values of first and second container
                System.out.println("First: " + firstContainer + "/" + 100);
                System.out.println("Second: " + secondContainer + "/" + 100);
            }
        }
    }
}
