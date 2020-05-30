
import java.util.ArrayList;

public class Hold {

    private int suitcaseWeight;
    private int maxWeight;
    private ArrayList<Suitcase> list = new ArrayList<>();

    //constructor for class "
    public Hold(int maxWeight) {
        this.suitcaseWeight = 0;
        this.maxWeight = maxWeight;
        this.list = new ArrayList<>();
    }

    //method that adds suitcase to the hold
    public void addSuitcase(Suitcase suitcase) {
        //checks if the sum weight of suitcases is less then maximum allowed weight
        if (this.suitcaseWeight + suitcase.totalWeight() <= maxWeight) {
            this.list.add(suitcase);
            this.suitcaseWeight += suitcase.totalWeight();
        }
    }

    //method that prints out all items from the hold's suitcases
    public void printItems() {
        for (Suitcase suitcase : this.list) {
            suitcase.printItems();
        }
    }

    //method that prints the number of suitcases and whole weight of them
    public String toString() {
        //checks if the lis is empty, if it is the program returns null
        if (this.list.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        if (this.list.size() == 1) {
            return "1 suitcase (" + this.suitcaseWeight + " kg)";
        }
        return this.list.size() + " suitcases (" + this.suitcaseWeight + " kg)";
    }
}
