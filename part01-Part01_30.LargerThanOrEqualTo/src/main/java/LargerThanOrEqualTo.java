
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //initiate the first number
        System.out.println("Give the first number:");
        int first = scan.nextInt();
        
        //initiate the second number
        System.out.println("Give the second number:");
        int second = scan.nextInt();
        
        //checks which of two numbers are greater
        
        if (first > second) {
            System.out.println("Greater number is: " + first);
        } else if (second > first) {
            System.out.println("Greater number is: " + second);
        } else {
            System.out.println("The nuumbers are equal!");
        }

    }
}
