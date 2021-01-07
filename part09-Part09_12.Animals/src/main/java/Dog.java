/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bojan Lukic
 */
public class Dog extends Animal implements NoiseCapable {

    //constructor for class Dog
    public Dog(String name) {
        super(name);
    }

    //constructor for class Dog with no parameters - it gives the dog object name "Dog"
    public Dog() {
        super("Dog");
    }

    //method that prints out that the dog eats
    @Override
    public void eat() {
        super.eat();
    }

    //method that prints out that the dog sleeps
    @Override
    public void sleep() {
        super.sleep();
    }

    //method that prints out that the dog bark
    public void bark() {
        System.out.println(super.getName() + " barks");
    }

    //method that prints out the dog bark
    public void makeNoise() {
        System.out.println(super.getName() + " barks");
    }

}
