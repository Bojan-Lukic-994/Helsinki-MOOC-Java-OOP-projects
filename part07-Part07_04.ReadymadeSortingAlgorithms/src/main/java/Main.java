/*
Add the following methods to the Main class:
public static void sort(int[] array) that sorts an array of integers.
public static void sort(String[] array) that sorts an array of strings.
public static void sortIntegers(ArrayList<Integer> integers) that sorts a list of integers.
public static void sortStrings(ArrayList<String> strings) that sorts a list of strings
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

//method that sorts an array of integers.
    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    //method that sorts an array of strings.
    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    //method that sorts a list of integers.}
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    //method that sorts a list of strings
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
    
}
