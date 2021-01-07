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
import java.util.Arrays;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> list;
    
    //constructor for class Herd
    public Herd() {
        this.list = new ArrayList<>();
    }
    
    //method that adds new Movable object to the list
    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }
    
    //moves the herd with by the amount specified by the parameters
    @Override
    public void move(int dx, int dy) {
       for (Movable item : this.list) {
           item.move(dx, dy);
       }
    }
    
    //method that returns the string representation of members of the herd
   @Override
    public String toString() {
        return this.list.toString();
    }
}
