/*
Create a Cube class that represents a cube (i.e., a standard hexahedron). 
Create a public Cube (int edgeLength) constructor for the class, that takes the length of the cube's edge as its parameter.

Make a public int volume() method for the cube, which calculates and returns the cube's volume. 
The volume of the cube is calculated with the formula edgeLength * edgeLength * edgeLength. 
Moreover, make a public String toString() method for the cube, which returns a string representation of it. 
The string representation should take the form "The length of the edge is l and the volume v", 
where l is the length and v the volume - both the length and volume must be represented as integers.
 */
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Experiment with your program here
        Cube oSheaJackson = new Cube(4);
        System.out.println(oSheaJackson.volume());
        System.out.println(oSheaJackson);

        System.out.println();

        Cube salt = new Cube(2);
        System.out.println(salt.volume());
        System.out.println(salt);
    }
}
