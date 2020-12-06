
import java.util.ArrayList;

public class OneItemBox extends Box {

    private double capacity;
    private ArrayList<Item> list;

    //constructor for clas OneItemBox
    public OneItemBox() {
        this.list = new ArrayList<>();
    }

    //method that adds item to the box if the box is empty
    //also, the weight of the item becomes the capacity of the box
    @Override
    public void add(Item item) {
        if (this.list.isEmpty()) {
            this.list.add(item);
            this.capacity = item.getWeight();
        }
    }

    //method that checks if the searched item is in the box
    public boolean isInBox(Item item) {
        if (this.list.contains(item)) {
            return true;
        }
        return false;
    }
}
