//Define a two-parameter method smallest that returns the 
//smaller of the two numbers passed to it as parameters.

public class Smallest {

    //returns the smallest of the given numbers
    public static int smallest(int number1, int number2) {
        int smallestNum = 0;
        if (number1 < number2) {
            smallestNum = number1;
        } else if (number1 > number2) {
            smallestNum = number2;
        }
        return smallestNum;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
