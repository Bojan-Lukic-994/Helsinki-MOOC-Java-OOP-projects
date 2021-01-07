/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bojan Lukic
 */
public abstract class Animal {
    private String animalName;
    
    //constructor for class Animal
    public Animal(String name) {
      this.animalName = name;
    }
    
    //method that returns the name of the animal
    public String getName() {
        return this.animalName;
    }
    
    //method that prints out that the animal eats
    public void eat(){
      System.out.println(this.animalName + " eats");
    }
    
    //method that prints out that the animal sleeps
    public void sleep() {
        System.out.println(this.animalName + " sleeps");
    }
    
    
}
