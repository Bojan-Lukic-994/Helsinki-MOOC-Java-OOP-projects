//Write a program, that reads a string from the user and then prints it three times.

import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //enters the given word
        System.out.println("Give a word: ");
        String word = scanner.nextLine();

        //prints the word three times (connected)
        System.out.println("");
        System.out.println(word + word + word);
    }
}
