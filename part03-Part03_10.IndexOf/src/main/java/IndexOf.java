/*The exercise template contains a base that reads numbers from the user and adds them to a list. 
Reading is stopped once the user enters the number -1.
Expand the program by adding a functionality that asks the user for a number, and reports that number's index in the list. 
If the number is not found, the program should not print anything.*/

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //creates the Integer list and adds inputs to the list
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        //asks for the index of the number
        System.out.println("Search for?");
        int number = Integer.valueOf(scanner.nextLine());

        //finds the index of the number and prints it
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(number)) {
                System.out.println(number + " is at index " + i);
            }
        }
    }

}
