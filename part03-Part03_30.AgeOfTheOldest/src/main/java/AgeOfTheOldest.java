/*
Write a program that reads names and ages from the user until an empty line is entered. T
he name and age are separated by a comma.
After reading all user input, the program prints the age of the oldest person. 
You can assume that the user enters at least one person, and that one of the users is older than the others.
 */
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        while (true) {
            //enters the persons names
            String name = scanner.nextLine();
            String[] pieces = name.split(",");
            //stops if input is equal to whitespot
            if (name.equals("")) {
                break;
            }
            //finds out the age of the oldest person
            if (Integer.valueOf(pieces[1]) >= age) {
                age = Integer.valueOf(pieces[1]);
            }
        }
        //prints out the age of the oldest person
        System.out.println("Age of the oldest: " + age);
    }
}
