/*
Write a program that reads user input until an empty line. 
For each non-empty string, the program splits the string by spaces and then 
prints the pieces that contain av, each on a new line.
 */
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //splits the string by whitespot
            String word = scanner.nextLine();
            String[] pieces = word.split(" ");

            //loop stops if word is equal to ""
            if (word.equals("")) {
                break;
            }

            //checks if the word contains "av", prints it if it does
            for (String item : pieces) {
                if (item.contains("av")) {
                    System.out.println(item);
                }
            }
        }

    }
}
