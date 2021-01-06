/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bojan Lukic
 */
public class Item {

    private String productName;
    private int quantity;
    private int price;

    //constructor for class Item
    public Item(String product, int qty, int unitPrice) {
        this.productName = product;
        this.quantity = qty;
        this.price = unitPrice;
    }

    //method that returns the price of the item (price = quantity * item price)
    public int price() {
        return this.quantity * this.price;
    }

    //method that increases the quantity of the item by 1
    public void increaseQuantity() {
        this.quantity++;
    }

    //method that prints out the item (name and quantity)
    public String toString() {
        return this.productName + ": " + this.quantity;
    }
}
