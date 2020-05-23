/*
Write a program that prompts the user for a filename, as well as the upper and lower bounds for the accepted range of numbers. 
Then the program reads the numbers contained in the file (each number is on its own line) 
and only accounts for the numbers which are inside the given range. 
Finally, the program should print the number of numbers that were inside the given range.
 */
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int count = 0;

        System.out.print("File? ");
        String file = scanner.nextLine();

        //reads all numbers from the file
        try (Scanner finder = new Scanner(Paths.get(file))) {
            //adds all numbers from the file to the list
            while (finder.hasNextLine()) {
                numbers.add(Integer.valueOf(finder.nextLine()));
            }
            //prints out found exception
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        //asks for the lower bound
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());

        //asks for the upper bound
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        //finds out the amount of numbers between the lower and upper bound
        for (int number : numbers) {
            if (number >= lowerBound && number <= upperBound) {
                count++;
            }
        }

        //prints out the amount of numbers between the lower and upper bound
        System.out.println("Numbers: " + count);
    }

}
