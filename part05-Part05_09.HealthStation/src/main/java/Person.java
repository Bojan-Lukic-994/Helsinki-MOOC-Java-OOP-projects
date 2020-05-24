/*
In the exercise base there is the class Person, which we are already quite familiar with. 
There is also an outline for the class HealthStation. 
Health station objects process people in different ways, they e.g. weigh and feed people. In this exercise we will construct a health station. 
The code of the Person class should not be modified in this exercise!

PART1: In the outline of the Health station there is an outline for the method weigh. 
The method receives a person as a parameter, and it is meant to return to its caller the weight of that person. 
The weight information can be found by calling a suitable method of the person person. 
So your task is to complete the code of the method!

PART2: It is possible to modify the state of the object that is received as a parameter. 
Write a method called public void feed(Person person) for the health station. 
It should increase the weight of the parameter person by one.

PART3: Create a new method called public int weighings() for the health station. 
It should tell how many weighings the health station has performed. 
NB! You will need a new object variable for counting the number of weighings!
 */
public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void printPerson() {
        System.out.println("My name is " + this.name + " and I am " + this.age + " years old");
    }

    public void growOlder() {
        this.age++;
    }

    public boolean isOfLegalAge() {
        if (this.age > 17) {
            return true;
        }

        return false;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double bmi() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "My name is " + this.name + " and I am " + this.age + " years old. My BMI is " + this.bmi();
    }
}
