/*
Let's create an interactive program to control two liquid containers. 
The containers are named "first" and "second". Each are capable of containing 100 liters of liquid at a time.

The program offers the functionality to add, move and remove liquid. 
Using the "add" command will add liquid to the first container, "move" will move liquid from the first container to the second container and 
"remove" will remove liquid from the second container.

The commands must be defined as following:
add amount adds the amount of liquid specified by the parameter to the first container. 
The inserted amount must be specified as an integer. 
The container can't hold more than a hundred liters and everything added past that will go to waste.
move amount moves the amount of liquid specified by the parameter from the first container to the second container. 
The given amount must be specified as an integer. If the program is requested to move more liquid than than the first container currently holds, 
move all the remaining liquid. The second container can't hold more than one hundred liters of liquid and everything past that will go to waste.
remove amount removes the amount of liquid specified by the parameter from the second container. 
If the program is requested to remove more liquid than the container currently holds, remove all the remaining liquid.
After every command the program will print the contents of both containers. 
You don't have to take negative values into consideration.

All the functionality must be added to the method main in the class LiquidContainers (do not create new methods). 
The template already contains a loop which exits the program with the command "quit".
 */
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
