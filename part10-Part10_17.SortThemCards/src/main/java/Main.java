/*
The exercise template has a class that represents a playing card. Each card has a value and a suit. 
A card's value is represented as a number 2, 3, ..., 14 and its suit as Club, Diamond, Heart or Spade. Ace's value is 14. 
The value is represented with an integer, and the suit as an enum. 
Cards also have a method toString, which can be used to print the value and the suit in a readable form.

PART1: Change the Card class to be Comparable. Implement the compareTo method so that using it sorts the cards in ascending order based on their value. 
If the cards being compared have the same value, they are sorted by club first, diamond second, heart third, and spade last.

PART2: Create a class Hand to represent the cards in a player's hand. Add the following methods to the class:
public void add(Card card) adds a card to the hand
public void print() prints the cards in hand

PART3: Add a method public void sort() to the Hand class, which sorts the cards in the hand. After sorting, the cards are printed in order.

PART4: In a card game, hands are ranked based on the sum of values of its cards. 
Modify the Hand class to be comparable based on this criteria, i.e. change the class so that interface Comparable<Hand> applies to it.

PART5: What if we want to sort the cards in different ways, e.g. sorting all the cards of the same suit in a row. A class can only have one compareTo method, so we'll need something else to sort the cards in to a different order.

Alternative sorting systems are possible through different sorting classes. Such a class must have the Comparator<Card> interface. 
An object of the sorting class will then compare two cards give as parameters. 
The class only has one method, compare(Card c1, Card c2), 
which returns a negative value if the card c1 should be sorted before card c2, a positive value if card c2 comes before card c1, and zero if they are equal.
Now, create a class BySuitInValueOrder class that has the Comparator interface, which sorts the cards in the same order as in the above example, except that now the cards are sorted by value inside their suit.

PART6: Add a method public void sortBySuit() to class Hand. When the method is called, it sorts the cards in the hand with the same logic as in the previous part. 
After being sorted, the cards are printed in the following order:
 */

public class Main {

    public static void main(String[] args) {
        // test your code here

        Hand hand1 = new Hand();
        hand1.add(new Card(12, Suit.HEART));
        Hand hand2 = new Hand();
        hand2.add(new Card(3, Suit.SPADE));
        hand2.add(new Card(9, Suit.SPADE));
        hand2.compareTo(hand1);
    }
}
