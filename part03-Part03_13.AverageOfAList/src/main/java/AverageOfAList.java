/*The exercise template contains a base that reads numbers from the user and adds them to a list. 
Reading is stopped once the user enters the number -1.
When reading ends, calculate the average of the numbers in it, and then print that value.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //creates new ArrayList of Integer numbers
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            //adds inputs to the list
            list.add(input);
        }

        double average = 0;
        int sum = 0;

        //finds out the average of all the numbers in the list
        for (Integer item : list) {
            sum = sum + item;
        }
        average = (double) sum / list.size();

        //prints out the average of all the numbers in the list
        System.out.println("Average: " + average);
    }
}
