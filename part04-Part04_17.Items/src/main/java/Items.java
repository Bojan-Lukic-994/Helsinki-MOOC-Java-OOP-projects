/*
Implement the class Items described here. NB! Don't modify the class Item.
Write a program that reads names of items from the user. If the name is empty, the program stops reading. 
Otherwise, the given name is used to create a new item, which you will then add to the items list.
Having read all the names, print all the items by using the toString method of the Item class. 
The implementation of the Item class keeps track of the time of creation, in addition to the name of the item.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            //checks if name is empty, if it is the loop breaks
            if (name.isEmpty()) {
                break;
            }

            //addsa new name to the ArrayList "items"
            items.add(new Item(name));
        }

        //prints out all the names in the list
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
