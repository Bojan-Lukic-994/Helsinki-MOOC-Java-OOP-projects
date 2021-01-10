/*
In the exercise template, implement the class method public static List<Integer> positive(List<Integer> numbers), 
which receives an ArrayList of integers, and returns the positive integers from the list.
Implement the method using stream! For collecting the numbers try the command Collectors.toList() in addition to the Collectors.toCollection(ArrayList::new) command.
 */

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }

    //method that returns the positive numbers from the given list
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(number -> number > 0).collect(Collectors.toList());
    }

}
