
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //initiates the first string
        System.out.println("Enter the first string:");
        String first = scan.nextLine();
        
        //initiates the second string
        System.out.println("Enter the second string:");
        String second = scan.nextLine();
        
        //checks if the strings are equal and prints the message
        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

    }
}
