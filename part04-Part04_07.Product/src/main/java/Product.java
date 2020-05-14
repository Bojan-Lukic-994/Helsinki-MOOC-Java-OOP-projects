/*
Create a class Product that represents a store product. 
The product should have a price (double), a quantity (int) and a name (String).
The class should have:
the constructor public Item (String initialName, double initialPrice, int initialQuantity)
a method public void printProduct() that prints product information in the following format:
 * @author Bojan Lukic
 */
public class Product {

    //initiates the class variables
    private double price;
    private int quantity;
    private String name;

    //constructor for class "Product"
    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }
}
