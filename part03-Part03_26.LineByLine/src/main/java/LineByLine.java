/*
Write a program that reads strings from the user. If the input is empty, the program stops reading input and halts. 
For each non-empty input it splits the string input by whitespaces and prints each part of the string on a new line.
 */
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String item = scanner.nextLine();
            String[] pieces = item.split(" ");
            //returns the split items from the string
            for (int i = 0; i < pieces.length; i++) {
                System.out.println(pieces[i]);
            }
            //checks if the string is empty
            if (item.equals("")) {
                break;
            }
        }
    }
}
