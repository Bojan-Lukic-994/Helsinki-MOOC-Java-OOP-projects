/*
Create the class Gauge. The gauge has the instance variable private int value, 
a constructor without parameters (sets the initial value of the meter variable to 0), and also the following four methods:
Method public void increase() grows the value instance variable's value by one. It does not grow the value beyond five.
Method public void decrease() decreases the value instance variable's value by one. It does not decrease the value to negative numbers.
Method public int value() returns the value variable's value.
Method public boolean full() returns true if the instance variable value has the value five. Otherwise, it returns false.
 */
public class Gauge {

    private int value;

    //constructor for class "Gauge"
    public Gauge() {
    }

    //increases the value by 1 until value is 5
    public void increase() {
        if (value < 5) {
            value++;
        }
    }

    //decreases the value by 1, if it is bigger than 0
    public void decrease() {
        if (value > 0) {
            value--;
        }
    }

    //returns value
    public int value() {
        return value;
    }

    //checks if the value is full - if it is equal to 5 or not
    public boolean full() {
        if (value == 5) {
            return true;
        } else {
            return false;
        }
    }
}
