/*
In the estate agent's information system, an apartment that is on sale is represented by an object.
Your task is to create a few methods that can be used to compare apartments that are being sold.

PART1: Create a method public boolean largerThan(Apartment compared) 
that returns true if the apartment object whose method is called has a larger total area than the apartment object that is being compared.

PART2: Create a method public int priceDifference(Apartment compared) that returns 
the price difference of the apartment object whose method was called and the apartment object received as the parameter. 
The price difference is the absolute value of the difference of the prices 
(price can be calculated by multiplying the price per square by the number of squares).

PART3: Write a method public boolean moreExpensiveThan(Apartment compared) that 
returns true if the apartment object whose method is called is more expensive than the apartment object being compared.
 */
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));
        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));

        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   

        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt)); 
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));  
    }
}
