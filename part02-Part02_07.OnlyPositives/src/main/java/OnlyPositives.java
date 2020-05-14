
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //enters the positive int numbers, ignore negative numbers
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            
            if (num > 0) {
                System.out.println(num * num);
            }

            if (num < 0) {
                System.out.println("Unsuitable number");
                continue;
            }

            if (num == 0) {
                break;
            }
        }
    }
}
