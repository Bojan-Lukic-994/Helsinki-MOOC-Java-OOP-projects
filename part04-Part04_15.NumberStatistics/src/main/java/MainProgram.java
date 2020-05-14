/*
Part1: Create a class Statistics that has the following functionality (the file for the class is provided in the in the exercise template):
a method addNumber adds a new number to the statistics
a method getCount tells the number of added numbers.
Part2: Expand the class with the following functionality:
the sum method tells the sum of the numbers added (the sum of an empty number statistics object is 0)
the average method tells the average of the numbers added (the average of an empty number statistics object is 0
Part3:Write a program that asks the user for numbers until the user enters -1. The program will then provide the sum of the numbers.
The program should use a Statistics object to calculate the sum.
Part4: Change the previous program so that it also calculates the sum of even and odd numbers.
 */
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //creates new Statistics objects
        Statistics statistics = new Statistics();
        Statistics evensum = new Statistics();
        Statistics oddsum = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int value = Integer.valueOf(scan.nextLine());
            //checks if the value is -1, if it is the loop breaks
            if (value == -1) {
                break;
            }
            //checks if the number is even or odd and adds them to the separate sums
            if (value % 2 == 0) {
                evensum.addNumber(value);
            } else {
                oddsum.addNumber(value);
            }
            //summs all the given numbers
            statistics.addNumber(value);
        }

        //  System.out.println("Count: " + statistics.getCount());
        //prints out the sum of all given numbers
        System.out.println("Sum: " + statistics.sum());
        // System.out.println("Average: " + statistics.average());

        //prints out the sum of all even numbers
        System.out.println("Sum of even numbers: " + evensum.sum());

        //prints out the sum of all odd numbers
        System.out.println("Sum of odd numbers: " + oddsum.sum());
    }
}
