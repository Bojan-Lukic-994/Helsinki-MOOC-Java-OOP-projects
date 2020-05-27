
import java.util.ArrayList;

public class Stack {

    ArrayList<String> list = new ArrayList<>();

    //constructor for class "Stack"
    public Stack() {
        this.list = new ArrayList<>();
    }

    //method that checks if the list is empty or not
    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    //method that adds given value to the top of the list (stack)
    public void add(String value) {
        this.list.add(0, value);
    }

    //method that returns the values of the list
    public ArrayList<String> values() {
        return this.list;
    }

    //method that returns the topmost value - the last value added to the list and then removes it from the list
    public String take() {
        //stores the last added value to the new string
        String item = this.list.get(0);
        //removes the last added value
        this.list.remove(0);
        //returns the value stored in item
        return item;
    }
}
