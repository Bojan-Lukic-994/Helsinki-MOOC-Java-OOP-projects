/*
Exercise template contains a class Program. Implement the following class methods in the class:

public static void printKeys(HashMap<String,String> hashmap), prints all the keys in the hashmap given as a parameter.

public static void printKeysWhere(HashMap<String,String> hashmap, String text) prints the keys in the hashmap given as a parameter, 
which contain the string given as a parameter.

public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text), 
prints the values in the given hashmap whichs keys contain the given string.
 */
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");

    }

    //method that prints out all the keys in the hashmap
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String item : hashmap.keySet()) {
            System.out.println(item);
        }
    }

    //method that prints out the keys which contains the given string as a parameter
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String item : hashmap.keySet()) {
            if (item.contains(text)) {
                System.out.println(item);
            }
        }
    }

    //method that prints the values in the given hashmap whichs keys contain the given string
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String item : hashmap.keySet()) {
            if (item.contains(text)) {
                System.out.println(hashmap.get(item));
            }
        }
    }
}
