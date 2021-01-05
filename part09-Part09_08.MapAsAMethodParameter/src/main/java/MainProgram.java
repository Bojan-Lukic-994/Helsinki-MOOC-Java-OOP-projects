/*
In the class MainProgram implement a class method returnSize which gets a Map-object as a parameter, and returns its size as an integer.
*/
import java.util.HashMap;
import java.util.Map;

public class MainProgram {

    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");

        System.out.println(returnSize(names));
    }

    //method that returns the sum of all names in the given Map object
    public static int returnSize(Map<String, String> names) {
        return names.size();
    }

}
