/*
Write a program that reads strings from the user until the user inputs the string "end". 
As long as the input is not "end", the program should handle the input as an integer and 
print the cube of the number provided (i.e., number _ number _ number).
 */
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String item = scanner.nextLine();

            //loop breaks if user input is equal to "end"
            if (item.equals("end")) {
                break;
            }
            //converts the user input to Integer number
            int number = Integer.valueOf(item);

            //prints out the cube of the input number
            System.out.println(number * number * number);
        }
    }
}
