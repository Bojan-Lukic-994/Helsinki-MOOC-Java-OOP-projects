
public class Item {

    private String name;
    private int weight;

    //constructor for class "Item"
    public Item(String itemName, int itemWeight) {
        this.name = itemName;
        this.weight = itemWeight;
    }

    //method that returns the name of the item
    public String getName() {
        return this.name;
    }

    //method that returns the weight of the item
    public int getWeight() {
        return this.weight;
    }

    //method that prints out item's parameters - name and weight
    public String toString() {
        return this.name + "(" + this.weight + " kg)";
    }
}
