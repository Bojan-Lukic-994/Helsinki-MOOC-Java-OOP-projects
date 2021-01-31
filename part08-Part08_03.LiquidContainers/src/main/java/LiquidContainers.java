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

        //creates two integer items - they represent two containers
        int first = 0;
        int second = 0;

        //user adds, moves or removes liquid from containers
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            //reads the user input
            String command = scan.nextLine();

            //if user inputs "quit" the program stops
            if (command.equals("quit")) {
                break;
            }

            //splits user input into two pieces - command and amount
            String[] partsOfInput = command.split(" ");
            command = partsOfInput[0];
            int amount = Integer.valueOf(partsOfInput[1]);

            //"add" command adds amount to the first container
            if (command.equals("add") && amount > 0) {
                first = first + amount;
                if (first > 100) {
                    first = 100;
                }
            }

            //"move" command moves amount from first to second container
            if (command.equals("move") && amount > 0) {
                if (amount > first) {
                    amount = first;
                }

                first = first - amount;
                second = second + amount;

                if (second > 100) {
                    second = 100;
                }
            }

            //"remove" command removes amount from second container
            if (command.equals("remove") && amount > 0) {
                second = second - amount;
                if (second < 0) {
                    second = 0;
                }
            }

            System.out.println("");
        }
    }
}
