/*
Part1: Implement the decrement() method in the class body in such a way 
that it decrements the value variable of the object it's being called on by one. 
Once you're done with the decrement() method, the main program of the previous example should work to produce the example output.

Part2: Implement the decrement() in such a way that the counter's value never becomes negative. 
This means that if the value of the counter is 0, it cannot be decremented. A conditional statement is useful here.

Part3: Create the method public void reset() for the counter that resets the value of the counter to 0. For example: 
 */
public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    //decrements the value by 1, it should never be less then 0
    public void decrement() {
        this.value = this.value - 1;
        if (this.value < 0) {
            this.value = 0;
        }
    }

    //method that resets the value to 0
    public void reset() {
        this.value = 0;
    }
}
