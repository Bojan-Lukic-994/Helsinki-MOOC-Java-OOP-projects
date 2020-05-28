/*
The exercise template has a predefined SimpleCollection class, which is used to represent a group of values. 
The class is missing the toString method used for printing.

Implement a toString method for the class that will perform as demonstrated in the following examples.
 */
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    //method that prints out the elements in the list
    public String toString() {
        //creates new string output
        String output = "The collection " + this.name;

        //checks if the list is empty
        if (elements.isEmpty()) {
            return output + " is empty.";
        }

        //creates new String item - represents the size of the list
        String list = "";
        int numberOfItems = this.elements.size();

        //adds items to the new list (consists of elements from the arraylist)
        for (String element : elements) {
            list += "\n" + element;
        }

        //prints out the items from the list
        if (numberOfItems == 1) {
            return output + " has " + numberOfItems + " element:" + list;
        } else {
            return output + " has " + numberOfItems + " elements:" + list;
        }
    }

}
