/*
The exercise template has a predefined SimpleCollection class, which is used to represent a group of values. 
The class is missing the toString method used for printing.

Implement a toString method for the class that will perform as demonstrated in the following examples.
*/
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        SimpleCollection j = new SimpleCollection("characters");
        System.out.println(j);        
        
        System.out.println();
        
        j.add("magneto");
        System.out.println(j);
        
        System.out.println();
        
        j.add("mystique");
        System.out.println(j);
        
        System.out.println();
        
        j.add("phoenix");
        System.out.println(j);
        
        
    }
}
