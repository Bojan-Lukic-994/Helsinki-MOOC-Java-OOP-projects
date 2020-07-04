/*
In this exercise we create a program for printing statistics for points in course. 
The program receives points (integers from zero to one hundred) as input, based on which it prints statistics about grades. 
Reading of input stops when the user enters the number -1. 
Numbers that are not within the interval [0-100] should not be taken into account when calculating the statistics.

PART1: Write a program that reads integers representing course point totals from the user. 
Numbers between [0-100] are acceptable and the number -1 ends the reading of input. Other numbers are erroneous input, which should be ignored. 
When the user enters the number -1, the program should print the average of the point totals that were input.

PART2: Extend the program, such that it in addition to giving the point average of all totals also provides the point average for points giving a passing grade.
A passing grade is achieved by getting a minimum of 50 course points. 
You may assume that the user always provides at least one integer between [0-100]. 
If there are no numbers giving a passing grade, the program should print a line "-" where the average would be.

PART3: Extend the program from the previous part, such that it also print the pass percentage. 
The pass percentage is calculated using the formula 100 * passing / participants.

PART4: Each point total is converted to a grade based on the above table. If a point total isn't within [0-100], it should be ignored.
The grade distribution is printed out as stars. E.g. if there is one point total giving the grade 5, then it should print the row 5: *. 
If there are no point totals giving a particular grade, then no stars should be printed for it. 
In the sample below this is true for e.g. the grade 4.
 */
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        Statistics distribution = new Statistics();
 
        //enters the user input
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
 
            //calculates the grades and statistics from user input - given points
            distribution.addAllPoints(number);
        }
 
        //prints out the distribution of the points (grades)
        distribution.print();
    }
}
