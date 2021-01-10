/*
Write a program that reads user input. When the user gives a negative number as an input, the input reading will be stopped. 
After this, print all the numbers the user has given as input that are between 1 and 5.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        
        //method that adds user inputs to the list of inputs
        while (true) {
            int input = scanner.nextInt();
            
            //if input is empty string, the program stops
            if (input < 0) {
                break;
            }
            
            //adds new input to the list of inputs
            inputs.add(input);
        }

        //method that prints out all the numbers between 1 and 5 from user imports
        inputs.stream()
                .filter(i -> i >= 1 && i <= 5)
                .forEach(i -> System.out.println(i));
    }
}
