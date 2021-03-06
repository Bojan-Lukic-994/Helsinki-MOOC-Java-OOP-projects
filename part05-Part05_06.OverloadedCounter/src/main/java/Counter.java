/*
PART1: Implement a class called Counter. The class contains a number whose value can be incremented and decremented. 
The class must have the following constructors:
public Counter(int startValue) sets the start value of the counter to startValue.
public Counter() sets the start value of the counter to 0.

And the following methods:
public int value() returns the current value of the counter
public void increase() increases the value by 1
public void decrease() decreases the value by 1

PART2: Implement versions which are given one parameter of the methods increase and decrease.
 - public void increase(int increaseBy) increases the value of the counter by the value of increaseBy. 
If the value of increaseBy is negative, the value of the counter does not change.

 - public void decrease(int decreaseBy) decreases the value of the counter by the value of decreaseBy. 
If the value of decreaseBy is negative, the value of the counter does not change.
 */
public class Counter {

    private int value;

    //constructor for class "Counter" - sets start value to given number
    public Counter(int startValue) {
        this.value = startValue;
    }

    //constructor for class "Counter" - sets start value to 0
    public Counter() {
        this.value = 0;
    }

    //returns the value
    public int value() {
        return this.value;
    }

    //increases the value by 1
    public void increase() {
        this.value = this.value + 1;
    }

    //increases the value for the given number
    public void increase(int increaseBy) {
        //if given number is less than 0, the value stays the same
        if (increaseBy < 0) {
            this.value = this.value;
        } else {
            this.value = this.value + increaseBy;
        }
    }

    //increases the value by 1
    public void decrease() {
        this.value = this.value - 1;
    }

    //decreases the value for the given number
    public void decrease(int decreaseBy) {
        //if given number is less than 0, the value stays the same
        if (decreaseBy < 0) {
            this.value = this.value;
        } else {
            this.value = this.value - decreaseBy;
        }
    }
}
