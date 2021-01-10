/*
Write a program that reads the user's input as strings. 
When the user inputs an empty string (only presses enter), the input reading will be stopped and the program will print all the user inputs.
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        
        //method that adds user inputs to the list of inputs
        while (true) {
            String input = scanner.nextLine();
            
            //if input is empty string, the program stops
            if (input.equals("")) {
                break;
            }
            
            //adds new input to the list of inputs
            inputs.add(input);
        }
        
        //method that prints out all inputs from the user
        inputs.stream()
                .forEach(item -> System.out.println(item));
    }
}
