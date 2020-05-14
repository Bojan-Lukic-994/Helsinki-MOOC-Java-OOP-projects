
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //inputs the password
        System.out.println("Password?");
        String pass = scan.nextLine();
        
        //checks if the password is correct and prints the message
        if (pass.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}
