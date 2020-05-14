
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //initilazes the first integer number
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        
        //initilazes the second integer number
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        //prints the average of sum of two numbers
        System.out.println("The average is " + ((double) (first + second) / 2));

    }
}
