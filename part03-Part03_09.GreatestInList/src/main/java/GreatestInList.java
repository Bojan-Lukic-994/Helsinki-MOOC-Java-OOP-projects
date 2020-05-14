/*The exercise template contains a base that reads numbers from the user and adds them to a list. 
Reading is stopped once the user enters the number -1.
Continue developing the program so that it finds the greatest number in the list and prints its value after reading all the numbers.*/

import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //creates list of Integer numbers and adds inputs to the list
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        //finds the greatest number in the list
        int greatest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (greatest < number) {
                greatest = number;
            }
        }
        //prints out the greates number in the list
        System.out.println("The greates number: " + greatest);
    }

}
