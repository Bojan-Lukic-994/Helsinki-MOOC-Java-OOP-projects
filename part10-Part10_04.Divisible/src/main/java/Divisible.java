/*
The exercise template includes a template for the method public static ArrayList<Integer> divisible(ArrayList<Integer> numbers). 
Implement a functionality there that gathers numbers divisible by two, three or five from the list it receives as a parameter, and returns them as a new list. 
The list received as a parameter must not be altered.
 */

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));
    }

    //method that returns the numbers divisible by 2 or 3 or 5 from the given list
    //numbers are stored in a new ArrayList object
    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        return numbers.stream()
                .filter(item -> item % 2 == 0 || item % 3 == 0 || item % 5 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
