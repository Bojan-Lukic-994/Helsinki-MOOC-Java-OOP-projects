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
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation childrensHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(peter);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);

        System.out.println("weighings performed: " + childrensHospital.weighings());
    }
}