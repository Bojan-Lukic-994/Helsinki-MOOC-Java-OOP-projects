
import java.util.ArrayList;

public class MisplacingBox extends Box {

    private ArrayList<Item> list;

    //constructor for class MisplacingBox
    public MisplacingBox() {
        this.list = new ArrayList<>();
    }

    //method that adds item to the misplacing box
    public void add(Item item) {
        this.list.add(item);
    }

    //method that chekc if searched item is in the box
    public boolean isInBox(Item item) {
        return false;
    }
}
