/*In the exercise template there is a program that reads integers from the user and adds them to a list. 
This ends when the user enters 0. 
The program then prints the first value on the list.
Modify the program so that instead of the first value, the program prints the sum of the second and third numbers. */

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //creates ArrayList of integer numbers and adds them to the list
        //if added number is equal to 0, the loop breaks
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }

            numbers.add(number);
        }

        //print out the sum of second and third number
        System.out.println(numbers.get(1) + numbers.get(2));
    }
}
