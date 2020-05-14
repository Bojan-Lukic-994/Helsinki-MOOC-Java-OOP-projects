/*
Part1: Implement the decrement() method in the class body in such a way 
that it decrements the value variable of the object it's being called on by one. 
Once you're done with the decrement() method, the main program of the previous example should work to produce the example output.

Part2: Implement the decrement() in such a way that the counter's value never becomes negative. 
This means that if the value of the counter is 0, it cannot be decremented. A conditional statement is useful here.

Part3: Create the method public void reset() for the counter that resets the value of the counter to 0. For example: 
 */
public class MainProgram {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
}
