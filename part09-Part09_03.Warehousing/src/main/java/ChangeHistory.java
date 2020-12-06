
import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

    private ArrayList<Double> history;

    //constructor for class ChangeHistory - creates an empry object
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    //method that adds the provided status as the latest amount of change history
    public void add(double status) {
        this.history.add(status);
    }

    //method that clears the list
    public void clear() {
        this.history.clear();
    }

    //method that finds and returns the maximum value from the list
    public double maxValue() {
        if (history.isEmpty()) {
            return 0;
        } else {
            return (double) Collections.max(history);
        }
    }

    //method that finds and returns the minimum value from the list
    public double minValue() {
        if (history.isEmpty()) {
            return 0;
        } else {
            return (double) Collections.min(history);
        }
    }

    //method that returns the average of values from change history
    public double average() {
        double sum = 0;
        for (double item : this.history) {
            sum = sum + item;
        }
        return sum / this.history.size();
    }

    //method that returns the change history
    public String toString() {
        return this.history.toString();
    }
}
