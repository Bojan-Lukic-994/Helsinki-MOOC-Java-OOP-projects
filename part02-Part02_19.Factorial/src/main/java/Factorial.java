//Implement a program which calculates the factorial of a number given by the user.

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 1;

        //enter the given number
        System.out.println("Give a number:");
        int num = scanner.nextInt();

        //factorial of number 0
        if (num == 0) {
            sum = 1;
        }

        //calculates the factorial of the given number
        for (int i = 1; i <= num; i++) {
            sum = sum * i;
        }

        //prints out the factorial of the given number
        System.out.println("Factorial: " + sum);
    }
}
