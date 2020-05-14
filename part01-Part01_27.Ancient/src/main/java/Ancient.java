
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        
        //inputs the year
        int year = scan.nextInt();
        
        //prints message if year is less than 2015
        if (year < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
