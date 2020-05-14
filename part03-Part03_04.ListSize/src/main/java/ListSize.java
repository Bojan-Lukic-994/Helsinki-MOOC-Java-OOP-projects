//In the exercise template is a program that reads input from the user. 
//Modify its working so that when the program quits reading, the program prints the number of values on the list.

import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //creates ArrayList of Strings and adds inputs to the list
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        //prints out the number of values the given list contains    
        System.out.println("In total: " + list.size());

    }
}
