/*
PART1: Create a class Person.

PART2: Create a class Student, which inherits the class Person.
At creation, a student has 0 study credits. Every time a student studies, the amount of study credits goes up.

PART3: In the previous task, Studentinherits the toString method from the class Person. 
However, you can also overwrite an inherited method, replacing it with your own version. 
Write a version of toString method specifically for the Student class.

PART4: Create a class Teacher, which inherits the class Person.

PART5: Write a method public static void printPersons(ArrayList<Person> persons) in the Main class. 
The method prints all the persons on the list given as the parameter.
 */
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }

    //method that prints out all persons in the list of persons
    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
