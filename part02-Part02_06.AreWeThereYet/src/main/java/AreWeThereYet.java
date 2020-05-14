
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prints out given integer numbers, if number is 4 it closes down
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            if (num == 4) {
                break;
            }
        }
    }
}
