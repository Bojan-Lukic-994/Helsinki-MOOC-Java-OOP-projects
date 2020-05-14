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
public class PaymentCard {

    private double balance;
    private final double affordable;
    private final double hearty;

    //constructor for class "PaymentCard"
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        this.affordable = 2.6;
        this.hearty = 4.6;
    }

    //returns the reduced balance (for 2.60e) if it doesn't turn negative
    public void eatAffordably() {
        if (this.balance >= this.affordable) {
            this.balance = this.balance - this.affordable;
        }
    }

    //returns the reduced balance (for 4.60e) if it doesn't turn negative
    public void eatHeartily() {
        if (this.balance >= this.hearty) {
            this.balance = this.balance - this.hearty;
        }
    }

    //adds amount to the balance (limit for balance is 150)
    public void addMoney(double amount) {

        //balance doesn't change if amount is less than 0
        if (amount < 0) {
            return;

            //adds amount to the balance
        } else {
            this.balance = this.balance + amount;
            if (this.balance > 150) {
                this.balance = 150;
            }
        }
    }

    //returns the balance of the PaymentCard
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
