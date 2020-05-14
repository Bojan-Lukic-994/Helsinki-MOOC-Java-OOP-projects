
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //enters two integer numbers
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        //prints the square root of the sum of two given numbers
        double squareRoot = Math.sqrt(num1 + num2);
        System.out.println(squareRoot);
    }
}
