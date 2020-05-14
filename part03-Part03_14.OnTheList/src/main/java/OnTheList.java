/*In the exercise template there is a program that reads inputs from the user until an empty string is entered. 
Add the following functionality to it: after reading the inputs one more string is requested from the user. 
The program then tell whether that string was found in the list or not.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //creates ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            //adds inputs to the list
            list.add(input);
        }

        System.out.println("Search for?");
        String item = scanner.nextLine();

        //searches for wanted item an prints it if is in the list
        if (list.contains(item)) {
            System.out.println(item + " was found!");
        } else {
            System.out.println(item + " was not found!");
        }
    }
}
