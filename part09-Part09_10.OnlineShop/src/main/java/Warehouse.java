/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bojan Lukic
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> productsPrice;
    private Map<String, Integer> productsStock;

    //constructor for class Warehouse
    public Warehouse() {
        this.productsPrice = new HashMap<String, Integer>();
        this.productsStock = new HashMap<String, Integer>();
    }

    //method that adds product to the warehouse
    public void addProduct(String product, int price, int stock) {
        this.productsPrice.put(product, price);
        this.productsStock.put(product, stock);
    }

    //method that returns the price of the wanted product
    public int price(String product) {
        return this.productsPrice.getOrDefault(product, -99);
    }

    //method that returns the stock of the wanted product
    public int stock(String product) {
        return this.productsStock.getOrDefault(product, 0);
    }

    //method that reduces the stock of given product by 1
    public boolean take(String product) {
        if (this.productsStock.containsKey(product) && this.productsStock.get(product).intValue() > 0) {
            this.productsStock.replace(product, this.productsStock.get(product) - 1);
            return true;
        } else {
            return false;
        }
    }

    //method that returns the names of the products in the warehous as a Set object
    public Set<String> products() {
        return this.productsStock.keySet();
    }
}
