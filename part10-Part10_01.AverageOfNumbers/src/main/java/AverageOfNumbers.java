/*
Implement a program, which reads user input. If the user input is "end", the program stops reading input. 
The rest of the input is numbers. When the user input is "end", the program prints the average of all of the numbers.
Implement calculating the average using a stream!
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

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
        
        //method that calculates the average of all numbers from the list
        double average = list.stream()
                .mapToInt(i -> Integer.valueOf(i))
                .average()
                .getAsDouble();
        
        //prints out the average of numbers from the list
        System.out.println("average of the numbers: " + average);
    }
}
