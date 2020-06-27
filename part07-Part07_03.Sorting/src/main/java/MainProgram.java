/*
PART1: Create in the class MainProgram a class method smallest that takes an integer array as a parameter. 
It should return the smallest value in the array.

PART2: Create a method called indexOfSmallest in the class MainProgram. 
It should return the index of the smallest number in the array that it receives as a parameter.

PART3: Create in the class MainProgram a class method called indexOfSmallestFrom. 
It works similarly to the method in the previous section, but only considers the table values from a certain index forwards. 
In addition to the table, it receives this start index as a parameter.

PART4: Create a class method swap in the class MainProgram. It receives as its parameters an array and two indices inside it. 
The method swaps the numbers in these indices with each other.

PART5: We have now assembled a set of useful methods. With their help, we can implement a sorting algorithm known by the name of selection sort.
The idea of selection sort is:
Move the smallest number in the array to index 0.
Move the second smallest number to index 1.
Move the third smalles number in the array to index 2.
Etc.
In other words:
Examine the array starting from index 0. Swap the following two numbers with each other: the number at index 0, and the smallest number in the array starting from index 0.
Examine the array starting from index 1. Swap the following two numbers with each other: the number at index 1, and the smallest number in the array starting from index 1.
Examine the array starting from index 2. Swap the following two numbers with each other: the number at index 2, and the smallest number in the array starting from index 2.
Etc.
Implement a class method called sort based on the idea above in the class MainProgram. 
It should include a loop that goes through the indices of the array. Certainly the method indexOfSmallestFrom and swap will come in handy. 
Additionally, print the contents of the array before sorting and after every iteration of the loop to ensure that the algorithm works as you expect it to.
 */

import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    //method that finds and returns the smallest number in the array
    public static int smallest(int[] array) {
        //initiates the smallest number - equal to the first number in the array
        int smallest = array[0];
        //finds the smallest number in the array
        for (Integer number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        //returns the smallest number in the array
        return smallest;
    }

    //method that finds the index of the smallest number
    public static int indexOfSmallest(int[] array) {
        //finds the smallest number in the array
        int smallestNumber = MainProgram.smallest(array);
        int indexOfSmallest = 0;
        //searchs for the index of the smallest number
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallestNumber) {
                indexOfSmallest = i;
            }
        }
        //returns the index of the smallest number
        return indexOfSmallest;
    }

    //method that finds and returns the index of the smallest number from certain point in array
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        //initiates the smallest number and its index - equal to the given number in the array
        int smallest = table[startIndex];
        int indexOfSmallest = startIndex;
        //finds the smallest number and its index in the array from the starting index
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                indexOfSmallest = i;
            }
        }
        //returns the index of the smallet\st number from given index
        return indexOfSmallest;
    }

    //method that swaps the given numbers with each other
    public static void swap(int[] array, int index1, int index2) {
        //initializes the helper number = has the value of the first number
        int helper = array[index1];
        //swaps the given numbers
        array[index1] = array[index2];
        array[index2] = helper;
    }

    //method that sorts the numbers in array from smallest to the biggest
    public static void sort(int[] array) {
        //loops through the array
        for (int i = 0; i < array.length; i++) {
            //sorts the smallest numbers - for every position checks if
            //in that position is the next smallest number
            //if it is, the number stays in position
            //if not, it swaps positions with next smallest number
            MainProgram.swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }
}
