/*
The exercise template includes the class Student, which has a name. 
Implement the Comparable interface in the Student class in a way, such that the compareTo method sorts the students in alphabetical order based on their names.
*/

public class MainProgram {

    public static void main(String[] args) {
        Student first = new Student("jamo");
        Student second = new Student("jamo1");
        System.out.println(first.compareTo(second));
    }
}
