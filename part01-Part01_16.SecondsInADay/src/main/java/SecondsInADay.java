
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //number of days to be converted to seconds
        System.out.println("How many days would you like to convert to seconds?");
        int num = scanner.nextInt();
        
        System.out.println(num * 60 * 60 * 24);

    }
}
