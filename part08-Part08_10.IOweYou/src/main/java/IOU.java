
import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> debts;

    //constructor for class "IOU"
    public IOU() {
        this.debts = new HashMap<>();
    }

    //method that adds a new debt to the list of debts
    public void setSum(String toWhom, double amount) {
        this.debts.put(toWhom, amount);
    }

    //method that returns the amount owed to the person whose name is given as a parameter 
    /*given solution:
     public double howMuchDoIOweTo(String toWhom) {
        return debt.getOrDefault(toWhom, 0.0);
    }
     */
    //(my solution)
    public double howMuchDoIOweTo(String toWhom) {
        for (String key : this.debts.keySet()) {
            if (key.equals(toWhom)) {
                return this.debts.get(key);
            }
        }
        return 0;
    }
}
