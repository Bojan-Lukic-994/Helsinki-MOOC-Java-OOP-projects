

/*
In this exercise we'll create program components, that can used to run an online store.

PART1:
Create the class Warehouse with the following methods:
public void addProduct(String product, int price, int stock), which adds a product to the warehouse with the price and stock balance given as parameters.
public int price(String product), which returns the price of the product it received as a parameter. If the product hasn't been added to the warehouse, the method must return -99.
The products in the warehouse (and in the next part their stock) must be stored in a variable of the type Map<String, Integer>! The object created can be a HashMap, but its type must be the Map-interface, rather than any implementation of that interface.
 
PART2:
Save the stock balance of products in a variable with the Map<String, Integer> type, in the same way the prices were stored. Supplement the warehouse with the following methods:
public int stock(String product) returns the current remaining stock of the product in the warehouse. If the product hasn't been added to the warehouse, the method must return 0.
public boolean take(String product) reduces the stock remaining for the product it received as a parameter by one, and returns true if there was stock remaining. If the product was not available in the warehouse the method returns false. A products stock can't go below zero.

PART3:
Let's add one more method to the warehouse:
public Set<String> products() returns the names of the products in the warehouse as a Set
This method is easy to implement with HashMap. You can get the products in the warehouse from either the Map storing the prices or the one storing current stock, by using the method keySet()
 
PART4:
Items can be added to the shopping cart. An item is a product with a quantity. You for example add an item representing one bread to the cart, or add an item representing 24 coffees.
Create the class Item with the following methods:
public Item(String product, int qty, int unitPrice); a constructor that creates an item corresponding to the product given as a parameter. qty tells us how many of the product are in the item, while unitPrice is the price of a single product.
public int price() return the price of the item. You get the items price by multiplying its unit price by its quantity(qty).
public void increaseQuantity increases the quantity by one.
public String toString() returns the string representation of the item.

PART5:
Internally, ShoppingCart stores products added there as Item-objects. ShoppingCart must have an instance variable with either the Map<String, Item> type, or the List<Item> type. Don't add any other instance variable to the ShoppingCart class, besides the List or Map used to store the items.
NB: If you save the items in a Map type variable, you'll finds its values() method to be quite useful for going though all the items objects stored in it for both this part of the exercise and the next.
First let's give ShoppingCart a constructor with no parameters and these methods:
public void add(String product, int price) adds an item to the cart that matches the product given as a parameter, with the price given as a parameter.
public int price() returns the total price of the shopping cart.

PART6:
Implement the method public void print() for the shopping cart. The method prints the Item-objects in the cart. The order they are printed in is irrelevant.
 
PART7:
Let's change our cart so that if a product is being added thats already in the cart, we don't add a new item, but instead update item already in the cart by calling its increaseQuantity() method.
 
PART8:
We now have all the parts we need for our "online store", except the store itself. Let's make that next. Our store has a warehouse that includes all our products. For each 'visit' we have a shopping cart. 
Every time the customer chooses a product its added to their cart if its available in the warehouse. At the same time, the stock in the warehouse is reduced by one.
Below you'll find a template for a text-based user interface for our store. Create a Store class for your project and copy-paste the code below there.

The store is almost done. The method public void shop(String customer) has a part you need to complete, marked with comments. 
In the marked part, add code that checks if the product requested by the customer is available and has stock in the warehouse. 
If so, reduce the products stock in the warehouse and add the product to the shopping cart.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 10);
        warehouse.addProduct("milk", 3, 20);
        warehouse.addProduct("cream", 2, 55);
        warehouse.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        Store store = new Store(warehouse, scanner);
        store.shop("John");
    }
}
