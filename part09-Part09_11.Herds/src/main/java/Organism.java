/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bojan Lukic
 */
public class Organism implements Movable {

    private int x;
    private int y;

    //constructor for class Organism
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //method that changes the valuse of the coordinates by the given values
    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    //method that returns the string representation of the organism
    public String toString() {
        return "x: " + this.x + "; y: " + this.y;
    }

}
