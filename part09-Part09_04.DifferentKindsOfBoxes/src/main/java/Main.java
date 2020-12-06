/*
In the exercise template you'll find the classes Item and Box. Box is an abstract class, where adding multiple items is implemented by repeatedly calling the add-method. 
The add-method, meant for adding a single item, is abstract, so every class that inherits it, must implement it. 
Your assignment is to edit the Box-class and to implement different kinds of boxes based on the Box class.

PART1: Implement the equals and hashCode methods for the Item-class. They are needed, so that you can use the contains-methods of different lists and collections. 
Implement the methods in such a way that value of the weight instance variable of the Item-class isn't considered. 
It's probably a good idea to make use of Netbeans's functionality to implement the equals and hashCode methods

PART2: Implement the class BoxWithMaxWeight, that inherits the Box class. BoxWithMaxWeight has a constructor public BoxWithMaxWeight(int capacity), that defines the max weight allowed for that box. 
You can add an item to a BoxWithMaxWeight when and only when, adding the item won't cause the boxes maximum weight capacity to be exceeded.

PART3: Next, implement the class OneItemBox, that inherits the Box class. OneItemBox has the constructor public OneItemBox(), and it has the capacity of exactly one item. 
If there is already an item in the box, it must not be switched. The weight of the item added to the box is irrelevant.

Next implement the class MisplacingBox, that inherits the Box-class. MisplacingBox has a constructor public MisplacingBox(). 
You can add any items to a misplacing box, but items can never be found when looked for. 
In other words adding to the box must always succeed, but calling the method isInBox must always return false.
 */

public class Main {

    public static void main(String[] args) {
        MisplacingBox box = new MisplacingBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
    }
}
