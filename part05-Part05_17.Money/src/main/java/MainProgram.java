/*
In the Payment card exercise we used a double-type object variable to store the amount of money. 
In real applications this is not the approach you want to take, since as we have seen, calculating with doubles is not exact. 
A more reasonable way to handle amounts of money is create an own class for that purpose.

PART1: First create the method public Money plus(Money addition) that returns a new money object that is worth 
the total amount of the object whose method was called and the object that is received as the parameter.

PART2: Create the method public boolean lessThan(Money compared) that returns true if the money-object on which 
the method is called on has a lesser value than the money object given as a parameter.
 */
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
//  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e
    }
}
