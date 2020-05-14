//Implement a program which calculates the sum of a closed interval, and prints it. 
//Expect the user to write the smaller number first and then the larger number.

import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        //enters first number
        System.out.println("First number?");
        int first = scanner.nextInt();

        //enters second number
        System.out.println("Second number?");
        int second = scanner.nextInt();

        //calculates the sum of a sequence from first to second number
        for (int i = first; i <= second; i++) {
            sum = sum + i;
        }

        //prints the sum of the number sequence
        System.out.println("The sum is " + sum);
    }
}
