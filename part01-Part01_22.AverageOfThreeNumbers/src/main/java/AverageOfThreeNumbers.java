
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //initilazes the first integer number
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        
        //initilazes the second integer number
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        //initilazes the third integer number
        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());

        
        //prints the average of sum of three numbers
        System.out.println("The average is " + ((double) (first + second + third) / 3));


    }
}
