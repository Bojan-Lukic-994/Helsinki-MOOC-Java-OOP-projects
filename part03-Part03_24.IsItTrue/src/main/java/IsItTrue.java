/*
Write a program that asks the user for a string. 
If the user writes the string "true", the program prints "You got it right!", otherwise it prints "Try again!".
 */
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //enters the word
        System.out.println("Give a string: ");
        String word = scanner.nextLine();

        //checks if the word is right - word is right if it is named "true"
        if (word.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
