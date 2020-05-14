
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int allNum = 0;

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            if (num < 0) {
                continue;
            }

            if (num > 0) {
                sum = sum + num;
                allNum = allNum + 1;
            }
        }
        if (allNum == 0) {
            System.out.println("Cannot calculate the average");
        }
        if (allNum > 0) {
            System.out.println((double)sum / allNum);
        }
    }
}
