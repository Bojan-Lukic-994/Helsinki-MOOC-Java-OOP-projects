
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        
        int number = scan.nextInt();
        
        //prints "Orwell" if number is equal to 1984
        if (number == 1984) {
            System.out.println("Orwell");
        }
    }
}
