/*
Write a program that reads user input until an empty line is entered. 
For each non-empty line the program splits the string by spaces and prints the last part of the string.
 */
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prints out the last word of the given string
        while (true) {
            //inputs the string
            String word = scanner.nextLine();
            String[] pieces = word.split(" ");

            //stops if the string is equal to whitespace
            if (word.equals("")) {
                break;
            }

            //prints out the last word
            System.out.println(pieces[pieces.length - 1]);
        }

    }
}
