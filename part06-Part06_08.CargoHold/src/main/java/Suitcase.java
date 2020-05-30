
import java.util.ArrayList;

public class Suitcase {

    private int suitcaseWeight;
    private int maxWeight;
    private ArrayList<Item> list = new ArrayList<>();

    //constructor for class "Suitcase"
    public Suitcase(int maxWeight) {
        this.suitcaseWeight = 0;
        this.maxWeight = maxWeight;
        this.list = new ArrayList<>();
    }

    //method that adds an item to the list
    public void addItem(Item item) {
        //checks if suitcase weight with added item is less then max weight
        if (this.suitcaseWeight + item.getWeight() <= this.maxWeight) {
            //if sum weight is less than max weight, adds item to the suitcase
            this.list.add(item);
            this.suitcaseWeight += item.getWeight();
        }
    }

    //method that prints all the items from the suitcas
    public void printItems() {
        for (Item item : this.list) {
            System.out.println(item.getName() + "(" + item.getWeight() + " kg)");
        }
    }

    //method that returns the total weight of the suitcase
    public int totalWeight() {
        return this.suitcaseWeight;
    }

    //method that returns the heavies item from the list
    public Item heaviestItem() {
        //checks if the suitcase is empty, if it is the program returns null
        if (this.list.isEmpty()) {
            return null;
        }
        //creates new item "heaviest" - the first item in the lise
        Item heaviest = this.list.get(0);
        //searches for the heaviest item in the list
        for (Item item : this.list) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        //returns the heavies item in from the list
        return heaviest;
    }
    
      //method that prints out the weight of the suitcase
    @Override
    public String toString() {
        String printer = " (" + this.suitcaseWeight + " kg)";
        //checks if the list is empty
        if (this.list.size() == 0) {
            return "no items" + printer;
        } else if (this.list.size() == 1) {
            return "1 item" + printer;
        } else {
            return this.list.size() + " items" + printer;
        }
    }

}
