/*
Write a program that reads strings from the user until the user inputs the string "end". 
At that point, the program should print how many strings have been read. 
The string "end" should not be included in the number strings read. You can find some examples below of how the program works.
 */
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (true) {
            String item = scanner.nextLine();

            //the loop breaks if user input is equal to "end"
            if (item.equals("end")) {
                break;
            }
            //increases the number of items added
            count++;
        }
        //prints out the total number of inputs
        System.out.println(count);
    }
}
