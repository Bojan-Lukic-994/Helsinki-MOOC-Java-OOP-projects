/* In the exercise template there is a program that reads inputs from the user and adds them to a list. 
Reading is stopped once the user enters an empty string.
Modify the program to print both the first and the last values after the reading ends. */

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //creates list of String type and adds items to the list
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        //prints out the firs value of the list
        System.out.println(list.get(0));

        //prints out the last value of the list
        System.out.println(list.get(list.size() - 1));
    }
}
