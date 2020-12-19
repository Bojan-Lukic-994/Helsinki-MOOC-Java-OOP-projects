
import java.util.ArrayList;


public class Box implements Packable {
    private double maxWeight;
    private ArrayList<Packable> items;
    
    //constructor for class Box
    public Box(double maxBoxWeight) {
        this.maxWeight = maxBoxWeight;
        this.items = new ArrayList<>();
    }
    
    //method that calculates and returns the weight of the box (weight of the items in box must be less than maximum box capacity)
    public double weight() {
        double weight = 0;
        for (Packable itemInBox : this.items) {
            weight = weight + itemInBox.weight();
        }
        return weight;
    }
    
    //method that adds an Packable item to the box
    public void add (Packable item) {
        if (this.weight() + item.weight() <= this.maxWeight) {
            this.items.add(item);
        }
        
    }
    
    //method that prints out the number of items in the box and box's weight
    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
