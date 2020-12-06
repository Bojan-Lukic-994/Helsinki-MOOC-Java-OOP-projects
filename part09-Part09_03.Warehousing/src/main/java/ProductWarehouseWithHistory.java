
import java.util.ArrayList;

public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history = new ChangeHistory();

    //constructor for class ProductWarehouseWithHistory
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        history.add(initialBalance);
    }
    
    //method that adds the amount to the warehouse
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(super.getBalance());
    }
    
    //method that removes the amount from the warehouse
    public double takeFromWarehouse(double amount) {
        super.takeFromWarehouse(amount);
        history.add(super.getBalance());
        return super.getBalance();
    }

    //method that returns the history of the product warehouse
    public String history() {
        return this.history.toString();
    }
    
    //method that prinst out the analysis of the product warehouse
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history.toString());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }
}
