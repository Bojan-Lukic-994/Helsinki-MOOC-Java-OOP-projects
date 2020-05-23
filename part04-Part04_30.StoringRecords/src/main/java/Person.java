/*
The exercise template already has a Person class, and the class StoringRecords has a body for the method 
public static ArrayList<Person> readPeople(String file). 
Implement the readPeople method such that it reads the persons from the file passed as a parameter, 
and finally returns them in the list returned by the method.

The exercise template has a main method that you can use to test how your program works. 
In this exercise, only modify the method readPeople
*/
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + ", age: " + this.age;
    }

}
