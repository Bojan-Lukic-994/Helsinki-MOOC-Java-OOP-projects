/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bojan Lukic
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> items;

    //constructor for class ShoppingCart
    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    //method that adds an item to the cart
    public void add(String product, int price) {
        this.items.putIfAbsent(product, new Item(product, 0, price));
        this.items.get(product).increaseQuantity();
    }

    //returns the total price of the shopping cart
    public int price() {
        int sum = 0;
        for (Item item : items.values()) {
            sum = sum + item.price();
        }
        return sum;
    }

    //method that prints the items in the shopping cart
    public void print() {
        for (Item item : items.values()) {
            System.out.println(item.toString());
        }
    }
}
