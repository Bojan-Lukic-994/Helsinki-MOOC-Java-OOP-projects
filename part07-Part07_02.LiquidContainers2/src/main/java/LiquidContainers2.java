/*
PART1: Make a class called Container. The class must have a constructor which does not take any parameters, and the following methods:
public int contains() which returns the amount of liquid in a container as an integer.
public void add(int amount) which adds the amount of liquid given as a parameter to the container. If the amount is negative, no liquid is added. 
A container can hold a maximum of 100 units of liquid.
public void remove(int amount) which removes the amount of liquid given as a parameter from the container. 
If the amount is negative, no liquid is removed. A container can never hold less than 0 units of liquid.
public String toString() which returns the container as a string formatted "amount of liquid/100, for example "32/100".

PART2: Copy the user interface you implemented for the previous example, and modify it to use the new Container class. 
The main method in the class LiquidContainers2 must start the program.
 */
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

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
                //adds the given amount to the first container
                firstContainer.add(amount);
                //prints out the values of first and second container
                System.out.println("First: " + firstContainer);
                System.out.println("Second: " + secondContainer);
            }

            //checks if the user wants to move amount from first to second container
            if (command.equals("move")) {
                firstContainer.remove(amount); // removes amount from first container
                secondContainer.add(amount); //adds amount to second container

                //prints out the values of first and second container
                System.out.println("First: " + firstContainer);
                System.out.println("Second: " + secondContainer);
            }

            //checks if the user wants to remove amount from the second container
            if (command.equals("remove")) {
                secondContainer.remove(amount);

                //prints out the values of first and second container
                System.out.println("First: " + firstContainer);
                System.out.println("Second: " + secondContainer);
            }
        }
    }
}
