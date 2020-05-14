
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //initialize the first number
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        
        //initialize the second number
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        //calculate the operations
        System.out.println(first + " + " + second + " = " + (first + second));
        System.out.println(first + " - " + second + " = " + (first - second));
        System.out.println(first + " * " + second + " = " + (first * second));
        System.out.println(first + " / " + second + " = " + (first / (double)second));

    }
}
