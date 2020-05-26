/*
n the exercise base you can find the Person class that is linked with an SimpleDate object. 
Add to the class Person the method public boolean equals (Object compared), which can be used to compare the similarity of people. 
The comparison should take into account the equality of all the variables of a person (birthday included).
 */
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    //compares the two objects
    public boolean equals(Object compared) {
        //checks if the variables are located in the same space - if they are, they are equal
        if (this == compared) {
            return true;
        }

        //checks if the object is a type "Person"
        if (!(compared instanceof Person)) {
            return false;
        }

        //cast object to Person object
        Person nekodrugi = (Person) compared;

        //checks if the values of the objects are the same
        if (this.name.equals(nekodrugi.name)
                && this.birthday.equals(nekodrugi.birthday)
                && this.height == nekodrugi.height
                && this.weight == nekodrugi.weight) {
            return true;
        }

        //otherwise returns false - the objects are not the same
        return false;
    }
}
