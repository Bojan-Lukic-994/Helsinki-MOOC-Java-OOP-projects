/*
Moving houses requires packing all your belongings into boxes. Let's imitate that with a program. 
The program will have boxes, and items to pack into those boxes. All items must implement the following Interface:

PART1: Create classes Book and CD, which implement the Interface. 
Book has a constructor which is given the author (String), name of the book (String), and the weight of the book (double) as parameters. CD has a constructor which is given the artist (String), name of the CD (String), and the publication year (int). 
The weight of all CDs is 0.1 kg.

PART2: Make a class called Box. Items implementing the Packable interface can be packed into a box. 
The Box constructor takes the maximum capacity of the box in kilograms as a parameter. 
The combined weight of all items in a box cannot be more than the maximum capacity of the box.

PART3: If you made an class variable double weight in the Box class, replace it with a method which calculates the weight of the box.

PART4: Implementing the Packable Interface requires a class to have the method double weight(). We just added this method to the Box class. 
This means we can make the Box packable as well!
Boxes are objects, which can contain objects implementing the packable Interface. 
Boxes implement this Interface as well. So a box can contain other boxes!
 */
public class Main {

    public static void main(String[] args) {
        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
    }

}
