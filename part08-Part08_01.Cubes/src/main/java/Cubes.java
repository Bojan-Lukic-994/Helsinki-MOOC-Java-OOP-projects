/*
Write a program that reads strings from the user until the user inputs the string "end". 
As long as the input is not "end" the program should handle the input as an integer and print the cube of the integer 
(meaning number * number * number).
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //user enters the input
            String input = scanner.nextLine();
            //in input is "end", the program stops
            if (input.equals("end")) {
                break;
            }
            //if input is a number, program prints out its cube
            int number = Integer.valueOf(input);
            System.out.println(number * number * number);
        }
    }
}
