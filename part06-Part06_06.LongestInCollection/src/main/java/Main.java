/*
The exercise template comes with the class SimpleCollection that's familiar from previous exercises. 
Implement the method public String longest() for the class, which returns the longest string of the collection. 
If the collection is empty, the method should return a null reference.
*/
public class Main {

    public static void main(String[] args) {


        // Try out your class here
        SimpleCollection c = new SimpleCollection("characters");
        System.out.println("Pisin: " + c.longest());
        
        c.add("magneto");
        c.add("mystique");
        c.add("phoenix");
        
        System.out.println("Longest: " + c.longest());

        
    }
}
