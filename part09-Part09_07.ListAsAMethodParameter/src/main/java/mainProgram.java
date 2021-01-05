
import java.util.ArrayList;
import java.util.List;


/*
In the mainProgram class, implement a class method returnSize, 
which is given a List-object as a parameter, and returns the size of the list as an integer.
 */
public class mainProgram {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));

    }

    //method that returns the size of the given list
    public static int returnSize(List list) {
        return list.size();
    }
}
