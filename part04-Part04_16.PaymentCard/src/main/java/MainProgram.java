/*
PART1: The project will include two code files:
The exercise template comes with a code file called Main, which contains the main method.
Add a new class to the project called PaymentCard. 
First, create the PaymentCard object's constructor, which is passed the opening balance of the card, and which then stores that balance in the object's internal variable. 
Then, write the toString method, which will return the card's balance in the form "The card has a balance of X euros".
PART2: Complement the PaymentCard class with the following methods:
The method eatAffordably should reduce the card's balance by € 2.60, and the method eatHeartily should reduce the card's balance by € 4.60.
PART3: What happens if the card runs out of money? It doesn't make sense in this case for the balance to turn negative. 
Change the methods eatAffordably and eatHeartily so that they don't reduce the balance should it turn negative.
PART4: Add the following method to the PaymentCard class:
The purpose of the method is to increase the card's balance by the amount of money given as a parameter. However, the card's balance may not exceed 150 euros. 
As such, if the amount to be topped up exceeds this limit, the balance should, in any case, become exactly 150 euros.
PART5: Change the addMoney method further, so that if there is an attempt to top it up with a negative amount, the value on the card will not change.
PART6: Write code in the main method of the MainProgram class that contains the following sequence of events:
Create Paul's card. The opening balance of the card is 20 euros
Create Matt's card. The opening balance of the card is 30 euros
Paul eats heartily
Matt eats affordably
The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
Paul tops up 20 euros
Matt eats heartily
The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
Paul eats affordably
Paul eats affordably
Matt tops up 50 euros
The cards' values ​​are printed (each on its own line, with the cardholder name at the beginning of it)
 */
public class MainProgram {

    public static void main(String[] args) {

        //creates two new PaymentCard objects
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        //reduces the balance from both cards
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        //prints out both cards balance
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        //adds some money to paulsCard and reduces some from mattsCard
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        //prints out both cards balance
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        //reduces money from paulsCard twice and adds some money to mattsCard
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);

        //prints out both cards balance
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
}
