
import java.util.HashSet;
import java.util.Set;

/*
In the Main-class, implement the static method returnSize, which receives a Set object as a parameter and returns its size.
 */
public class Main {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");

        System.out.println(returnSize(names));

    }

    //method that reurns the size of given Set object
    public static int returnSize(Set<String> names) {
        return names.size();
    }

}
