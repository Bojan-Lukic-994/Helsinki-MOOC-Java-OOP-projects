/*
Write a program that reads names and ages from the user until an empty line is entered. 
The name and age are separed by a comma.
After reading all user input, the program prints the name of the oldest person. 
You can assume that the user enters at least one person, and the that one of the users is older than the others.
 */
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "";
        while (true) {
            //enters the persons names
            String item = scanner.nextLine();
            String[] pieces = item.split(",");
            //stops if input is equal to whitespot
            if (item.equals("")) {
                break;
            }
            //finds out the age of the oldest person
            if (Integer.valueOf(pieces[1]) >= age) {
                age = Integer.valueOf(pieces[1]);
                name = pieces[0];
            }
        }
        //prints out the name of the oldest person
        System.out.println("Name of the oldest: " + name);
    }
}
