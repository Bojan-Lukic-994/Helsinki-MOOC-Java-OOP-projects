//In the exercise template there is a program that reads inputs from the user and adds them to a list. 
//Reading is stopped once the user enters an empty string.
//Your task is to modify the method to print the last read value after it stops reading.

import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //creates a list of String items and adds inputs to the list
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        //prints out the last input of the list
        System.out.println(list.get(list.size() - 1));

    }
}
