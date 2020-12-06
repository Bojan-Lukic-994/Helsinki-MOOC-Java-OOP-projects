
public class ProductWarehouse extends Warehouse {

    private String name;

    //constructor for class ProductWarehouse
    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.name = productName;
    }

    //method that returns the name of the ProductWarehouse
    public String getName() {
        return this.name;
    }

    //method that sets a new name for the product
    public void setName(String newName) {
        this.name = newName;
    }

    //method that prints out the product name, its current balance and space left
    public String toString() {
        return this.name + ": " + super.toString();
    }
}
