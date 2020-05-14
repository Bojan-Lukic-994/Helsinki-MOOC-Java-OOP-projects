/*
Write a program that recognizes the following users:
username	password
alex	sunshine
emma	haskell
 */
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //enters the username 
        System.out.println("Enter username: ");
        String username = scanner.nextLine();

        //enters the password
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        //checks if the username and password are correct
        if (username.equals("alex") && password.equals("sunshine")) {
            System.out.println("You have successfully logged in!");
        } else if (username.equals("emma") && password.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username and password!");
        }

    }
}
