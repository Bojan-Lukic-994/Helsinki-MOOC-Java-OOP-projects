
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;

    //constructor for class Hand
    public Hand() {
        this.cards = new ArrayList<>();
    }

    //method that adds a card to the hand
    public void add(Card card) {
        this.cards.add(card);
    }

    //method that prints out all cards from the hand
    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }
    
    //method that calculates and returns the sum of hand value
    private int sumOfValues() {
        int sum = 0;

        for (Card card : cards) {
            sum += card.getValue();
        }
 
        return sum;
    }

    //method that sorts the cards in ascending order
    public void sort() {
        Comparator<Card> comparator = Comparator.comparing(Card::getValue)
                .thenComparing(Card::getSuit);
        Collections.sort(cards, comparator);
    }

    //method that sorts the cards by suit and then by value
    public void sortBySuit() {
        Comparator<Card> comparator = Comparator.comparing(Card::getSuit)
                .thenComparing(Card::getValue);
        Collections.sort(cards, comparator);
    }

    //method that compares the values of two different hands
    @Override
    public int compareTo(Hand hand) {
        return this.sumOfValues() - hand.sumOfValues();
    }
}
