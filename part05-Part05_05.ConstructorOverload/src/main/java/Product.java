/*
The exercise template has a class Product, which represents a product in a shop. Every product has a name, location and weight.

Add the following three constructors to the Product class:

public Product(String name) creates a product with the given name. Its location is set to "shelf" and its weight is set to 1.
public Product(String name, String location) creates a product with the given name and the given location. Its weight is set to 1.
public Product(String name, int weight) creates a product with the given name and the given weight. Its location is set to "shelf".
 */
public class Product {

    private String name;
    private String location;
    private int weight;

    //constructor for class "Product" with all parameters - name, location and weight
    public Product(String name, String location, int weight) {
        this.location = location;
        this.name = name;
        this.weight = weight;
    }

    //constructor for class "Product" with one parameter - name; others are already set
    public Product(String name) {
        this.location = "shelf";
        this.name = name;
        this.weight = 1;
    }

    //constructor for class "Product" with two parameter - name and location; weight is set at 1
    public Product(String name, String location) {
        this.location = location;
        this.name = name;
        this.weight = 1;
    }

    //constructor for class "Product" with two parameter - name and weight; location is set at "shelf"
    public Product(String name, int weight) {
        this.location = "shelf";
        this.name = name;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}
