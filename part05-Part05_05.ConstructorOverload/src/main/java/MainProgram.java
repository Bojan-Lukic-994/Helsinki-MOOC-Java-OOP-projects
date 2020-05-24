/*
The exercise template has a class Product, which represents a product in a shop. Every product has a name, location and weight.

Add the following three constructors to the Product class:

public Product(String name) creates a product with the given name. Its location is set to "shelf" and its weight is set to 1.
public Product(String name, String location) creates a product with the given name and the given location. Its weight is set to 1.
public Product(String name, int weight) creates a product with the given name and the given weight. Its location is set to "shelf".
 */
public class MainProgram {

    public static void main(String[] args) {
        // Test your class here
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}
