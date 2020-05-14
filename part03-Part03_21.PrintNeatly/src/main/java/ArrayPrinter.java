/*
Complete the method public static void printNeatly(int[] array) in the class named 'ArrayPrinter' 
to make it print the numbers of the array it receives more neatly. 
There should be a whitespace and a comma between each number. don't put a comma after the last number.
Print the numbers on one line using System.out.print.
 */

public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    //prints out all the numbers in the array with a comma and a whitespace
    public static void printNeatly(int[] array) {
        for (int num = 0; num < array.length - 1; num++) {
            System.out.print(array[num] + ", ");
        }
        //prints out the last number of the array
        System.out.print(array[array.length - 1]);
    }
}
