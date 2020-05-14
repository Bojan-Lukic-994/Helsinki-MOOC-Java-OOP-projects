//Expand the previous program so that the main program asks the user 
//for the number of times the phrase will be printed (i.e. how many times the method will be called).

import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times:");
        int number = scanner.nextInt();
        int i = 0;

        //prints the method "printText" given number of times
        while (number > i) {
            printText();
            i++;
        }
    }

    //prints out the given statement
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
