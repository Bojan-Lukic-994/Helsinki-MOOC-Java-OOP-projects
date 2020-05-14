/*
Create a class Multiplier that has a:
Constructor public Multiplier(int number).
Method public int multiply(int number) which returns the value number passed to it multiplied by the number provided to the constructor.
You also need to create an instance variable in this exercise.
@author Bojan Lukic
 */
public class Multiplier {

    private int number;

    //constructor for class "Multiplier"
    public Multiplier(int number) {
        this.number = number;
    }

    // returns the value number passed to it multiplied by the number provided to the constructor.
    public int multiply(int number) {
        return this.number * number;
    }
}
