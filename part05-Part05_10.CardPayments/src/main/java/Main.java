/*
PART1: In a previous part we created a class called PaymentCard. The card had methods for eating affordably and heartily, and also for adding money to the card.
However, there was a problem with the PaymentCard class that is implemented in this fashion. 
The card knew the prices of the different lunches, and therefore was able to decrease the balance by the proper amount. 
What about if the prices are raised? Or new items are added to the list of offered products? 
A change in the pricing would mean that all the existing cards would have to be replaced with new cards that are aware of the new prices.

An improved solution is to make the cards "dumb"; unaware of the prices and products that are sold, and only keeping track of their balance. All the intelligence is better placed in separate objects, payment terminals.
Let's first implement the "dumb" version of the PaymentCard. The card only has methods for asking for the balance, adding money, and taking money. Complete the method public boolean takeMoney(double amount)

PART2: When visiting a student cafeteria, the customer pays either with cash or with a payment card. 
The cashier uses a payment terminal to charge the card or to process the cash payment. 
First, let's create a terminal that's suitable for cash payments.

The terminal starts with 1000 euros in it. 
Implement the methods so they work correctly, using the basis above and the example prints of the main program below.

PART3: Let's extend our payment terminal to also support card payments. 
We are going to create new methods for the terminal. 
It receives a payment card as a parameter, and decreases its balance by the price of the meal that was purchased. 
Here are the outlines for the methods, and instructions for completing them.

PART4: Let's create a method for the terminal that can be used to add money to a payment card. 
Recall that the payment that is received when adding money to the card is stored in the register.
*/
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
    }
}

