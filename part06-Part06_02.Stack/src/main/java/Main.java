/*
A stack is a data structure that you can add to and take from. Always to the top of it or from the top.

Create a Stack class that has a list of strings as an instance variable. Add the following methods to the class:
public boolean isEmpty() - returns a boolean-type value (true or false) that tells whether or not the stack is empty.
public void add(String value) - Adds the value given as a parameter to the top of the stack.
public ArrayList<String> values() - returns the values ​​contained in the stack as a list.
 */
public class Main {

    public static void main(String[] args) {

        Stack s = new Stack();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");

        while (!s.isEmpty()) {
            System.out.println(s.take());
        }
    }
}
