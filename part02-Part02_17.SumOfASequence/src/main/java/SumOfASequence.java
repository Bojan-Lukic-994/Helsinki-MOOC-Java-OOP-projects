//Implement a program, which calculates the sum 1+2+3+...+n where n is given as user input.

import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //asks for the number of inputs
        System.out.println("Last number?");
        int n = scanner.nextInt();
        int sum = 0;

        //adds the number of "n" values to the sum
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }

        //prints out the sum of n values
        System.out.println("The sum is " + sum);
    }
}
