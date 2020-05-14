//Create a method called average that calculates the average of the numbers passed as parameters. 
//The previously created method sum must be used inside this method!

public class Averaging {

    //returns the sum of the given number
    public static int sum(int number1, int number2, int number3, int number4) {
        int sum = number1 + number2 + number3 + number4;
        return sum;
    }

    //returns the average of the given numbers
    public static double average(int number1, int number2, int number3, int number4) {
        double average = (double) sum(number1, number2, number3, number4) / 4;
        return average;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
