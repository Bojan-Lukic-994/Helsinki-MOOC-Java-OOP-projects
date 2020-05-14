
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();

            //checks if the number is equal to 0
            if (num == 0) {
                break;
            }

            //adds number to the sum if it is not equal to 0
            if (num != 0) {
                sumOfNumbers = sumOfNumbers + 1;
                sum = sum + num;
            }
        }
        System.out.println("Average of the numbers: " + ((double)sum / sumOfNumbers));
    }
}
