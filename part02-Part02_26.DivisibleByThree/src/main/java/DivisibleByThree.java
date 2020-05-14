//Write a method public static void divisibleByThreeInRange(int beginning, int end) 
//that prints all the numbers divisible by three in the given range. 
//The numbers are to be printed in order from the smallest to the greatest.

import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
    }
    //prints the numbers divisible by 3

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
