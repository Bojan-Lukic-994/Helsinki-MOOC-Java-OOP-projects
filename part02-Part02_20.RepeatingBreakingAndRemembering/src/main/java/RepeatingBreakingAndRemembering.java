/*PART1:
Implement a program that asks the user for numbers (the program first prints "Write numbers: ") until the user gives the number -1. 
When the user writes -1, the program prints "Thx! Bye!" and ends.
PART2:
Extend the program so that it prints the sum of the numbers (not including the -1) the user has written.
PART3:
Extend the program so that it also prints the number of numbers (not including the -1) the user has written. 
PART4:
Extend the program so that it prints the mean of the numbers (not including the -1) the user has written.
PART5:
Extend the program so that it prints the number of even and odd numbers (excluding the -1).
 */

import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int sumOfNumbers = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers:");

        while (true) {
            int n = scanner.nextInt();

            //breaks out if number is equal to -1
            if (n == -1) {
                System.out.println("Thx! Bye");
                break;
            }

            //sums the given numbers
            sum = sum + n;
            sumOfNumbers = sumOfNumbers + 1;

            //checks if the numbers is even or odd
            if (n % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }
        //prints out the sum of the numbers, average of sum and number of even and odd numbers
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + sumOfNumbers);
        System.out.println("Average: " + ((double) sum / sumOfNumbers));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
