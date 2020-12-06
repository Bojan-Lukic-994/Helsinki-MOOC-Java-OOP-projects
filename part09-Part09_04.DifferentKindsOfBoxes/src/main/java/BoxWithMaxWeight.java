
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private double capacity;
    private ArrayList<Item> items;

    //constructor for class BoxWithMaxWeight
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    //method that adds item to the box if it doesn't exceed the allowed capacity
    public void add(Item item) {
        if (this.capacity - item.getWeight() >= 0) {
            this.items.add(item);
            this.capacity = this.capacity - item.getWeight();
        }
    }

    //method that chekcs if the looked item is in the box
    @Override
    public boolean isInBox(Item item) {
        if (this.items.contains(item)) {
            return true;
        }
        return false;
    }
}
