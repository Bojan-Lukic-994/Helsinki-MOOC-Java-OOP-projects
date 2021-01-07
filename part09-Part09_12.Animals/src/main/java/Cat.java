/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bojan Lukic
 */
public class Cat extends Animal implements NoiseCapable {

    //constructor for class Cat with parameter (name)
    public Cat(String name) {
        super(name);
    }

    //constructor for class Cat without parameters
    public Cat() {
        super("Cat");
    }

    //method that prints out that the cat eats
    @Override
    public void eat() {
        super.eat();
    }

    //method that prints out that the cat sleeps
    @Override
    public void sleep() {
        super.sleep();
    }

    //method that prints out that the cat purrs
    public void purr() {
        System.out.println(super.getName() + " purrs");
    }

    //method that prints out that the cat purrs
    public void makeNoise() {
        System.out.println(super.getName() + " purrs");
    }
}
