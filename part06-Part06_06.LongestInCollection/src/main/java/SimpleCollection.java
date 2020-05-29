/*
The exercise template comes with the class SimpleCollection that's familiar from previous exercises. 
Implement the method public String longest() for the class, which returns the longest string of the collection. 
If the collection is empty, the method should return a null reference.
 */
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    //constructor for class "SimpleCollection"
    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    //method that adds the element to the list
    public void add(String element) {
        this.elements.add(element);
    }

    //method that returns all the elements from the list
    public ArrayList<String> getElements() {
        return this.elements;
    }

    //method that finds and returns the longest element from the list
    public String longest() {
        //if the list is empty the program returns null
        if (this.elements.isEmpty()) {
            return null;
        }

        //gets the first item from the list
        String longest = this.elements.get(0);

        //loops through all items in the list
        for (String item : this.elements) {
            if (longest.length() < item.length()) {
                longest = item;
            }
        }

        //returns the longest item from the list
        return longest;
    }

}
