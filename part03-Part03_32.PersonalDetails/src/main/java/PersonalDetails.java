/*
Write a program that reads names and birth years from the user until an empty line is entered. 
The name and birth year are separated by a comma.
After that the program prints the longest name and the average of the birth years. 
If multiple names are equally longest, you can print any of them. You can assume that the user enters at least one person.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longest = "";
        int birthYears = 0;
        int sum = 0;

        while (true) {
            //inputs the items
            String item = scanner.nextLine();
            String[] pieces = item.split(",");
            //stops if the input is empty line
            if (item.equals("")) {
                break;

            }
            //finds out the longest name
            if (pieces[0].length() > longest.length()) {
                longest = pieces[0];
            }
            //sums all the birth years and adds name to the sum
            birthYears += Integer.valueOf(pieces[1]);
            sum = sum + 1;
        }
        //prints out the longest given name
        System.out.println("Longest name: " + longest);
        //finds out and prints the average of the given birth years
        System.out.println("Average of the birth years: " + (double) birthYears / sum);
    }
}
