
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //enters two integer numbers
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        
        //compares if the numbers are equal 
        if (first > second) {
            System.out.println(first + " is greater than " + second);
        } else if (first < second) {
            System.out.println(first + " is smaller than " + second);
        } else {
            System.out.println(first + " is equal to " + second);
        }
    }
}
