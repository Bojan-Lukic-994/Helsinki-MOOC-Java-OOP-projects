/*
Write a number that asks user for input until the user inputs 0. 
After this, the program prints the average of the positive numbers (numbers that are greater than zero).

If no positive number is inputted, the program prints "Cannot calculate the average"
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        //inputs the variables - scanner, arraylist of positive numbers and sum of positive numbers
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        int sum = 0;

        while (true) {
            //inputs the number
            int number = Integer.valueOf(scanner.nextLine());

            //checks if the numbers is equal to 0 - if yes, the program stops running
            if (number == 0) {
                break;
            }
            //if number is bigger than 0, adds it to the list and the sum of positive numbers
            if (number > 0) {
                positiveNumbers.add(number);
                sum = sum + number;
            }
        }

        //prints out the average of positive numbers
        if (positiveNumbers.isEmpty()) {
            System.out.println("Cannot caluclate the average");
        } else {
            System.out.println((double) sum / positiveNumbers.size());
        }
    }
}
