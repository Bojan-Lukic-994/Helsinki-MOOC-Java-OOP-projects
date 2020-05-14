/*
Part1: Create a class Statistics that has the following functionality (the file for the class is provided in the in the exercise template):
a method addNumber adds a new number to the statistics
a method getCount tells the number of added numbers.
Part2: Expand the class with the following functionality:
the sum method tells the sum of the numbers added (the sum of an empty number statistics object is 0)
the average method tells the average of the numbers added (the average of an empty number statistics object is 0
Part3:Write a program that asks the user for numbers until the user enters -1. The program will then provide the sum of the numbers.
The program should use a Statistics object to calculate the sum.
Part4: Change the previous program so that it also calculates the sum of even and odd numbers.
 */
public class Statistics {

    private int count;
    private int sum;

    //constructor for class "Statistics"
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    //adds the given numbers
    public void addNumber(int number) {
        this.count = this.count + 1;
        this.sum = this.sum + number;
    }

    //returns the count of numbers
    public int getCount() {
        return this.count;
    }

    //returns the sum of all numbers
    public int sum() {
        return this.sum;
    }

    //returns the average of added numbers
    public double average() {
        double avg = (double) this.sum / this.count;
        if (avg > 0) {
            return avg;
        } else {
            return 0;
        }
    }
}
