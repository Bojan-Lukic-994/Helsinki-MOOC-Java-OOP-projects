/*
Implement a program, which reads user input. If the user input is "end", program stops reading input. The rest of the input is numbers.
Then user is asked if the program should print the average of all the positive numbers, or the average of all the negative numbers (n or p). 
If the user selects "n", the average of all the negative numbers is printed. Otherwise the average of all the positive numbers is printed.
Use streams to calculate the average and filter the numbers!
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");

        //method that adds inputs to the list
        while (true) {
            String input = scanner.nextLine();

            //checks if the input is equal to "end" - if it is the program stops
            if (input.equals("end")) {
                break;
            }

            //adds an input to the list
            list.add(input);
        }
        
        //user inputs what output to print - average of negative or positive numbers (n or p)
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String answer = scanner.nextLine();
        
        //prints out the average of all negative numbers in the list
        if (answer.equals("n")) {
            System.out.println("Average of the negative numbers: " + list.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number < 0).average().getAsDouble());
        
        //prints out the average of all positive numbers in the list
        } else if (answer.equals("p")) {
            System.out.println("Average of the positive numbers: " + list.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number > 0).average().getAsDouble());
        }
    }
}
