/*
We'll practise wrapping gifts in this exercise. 
Let's create the classes Gift and Package. The gift has a name and weight, and the package contains gifts.

PART1: Create a Gift class, where the objects instantiated from it represent different kinds of gifts. 
The information that's recorded is the name and weight of the item (kg).
Add the following methods to the class:

Constructor for which the name and weight of the gift are given as parameters
Method public String getName(), which returns the name of the gift
Method public int getWeight(), which returns the weight of the gift
Method public String toString(), which returns a string in the form "name (weight kg)"

PART2: Create a Package class to which gifts can be added, and that keeps track of the total weight of the gifts in the package. 
The class should contain:
A parameterless constructor
Method public void addGift(Gift gift), which adds the gift passed as a parameter to the package. The method returns no value.
Method public int totalWeight(), which returns the total weight of the package's gifts.
It's recommended to store the items in an ArrayList object.
 */
import java.util.ArrayList;

public class Package {

    private ArrayList<Gift> gifts = new ArrayList<>();

    //constructor for class "Package
    public Package() {
        this.gifts = new ArrayList<>();
    }

    //method that adds given gift to the list of gifts
    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    //method that returns the total sum of weight of all gifts
    public int totalWeight() {
        int weight = 0;
        for (Gift gift : this.gifts) {
            weight = weight + gift.getWeight();
        }
        return weight;
    }
}
