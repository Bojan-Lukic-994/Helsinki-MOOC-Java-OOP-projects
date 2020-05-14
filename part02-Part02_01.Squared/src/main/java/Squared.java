
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //enters the given number
        int num = scanner.nextInt();
        
        //prints out the square of the given number
        int sum = num * num;
        System.out.println(sum);
    }
}
