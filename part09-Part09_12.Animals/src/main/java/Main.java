/*
PART1:
First implement an abstract class called Animal. The class should have a constructor that takes the animal's name as a parameter. 
The Animal class also has non-parameterized methods eat and sleep that return nothing (void), and a non-parameterized method getName that returns the name of the animal.
The sleep method should print "(name) sleeps", and the eat method should print "(name) eats". Here (name) is the name of the animal in question.

PART2:
Implement a class called Dog that inherits from Animal. Dog should have a parameterized constructor that can be used to name it. The class should also have a non-parameterized constructor, which gives the dog the name "Dog". 
Another method that Dog must have is the non-parameterized bark, and it should not return any value (void). Like all animals, Dog needs to have the methods eat and sleep.
 
PART3:
Next to implement is the class Cat, that also inherits from the Animal class. 
Cat should have two constructors: one with a parameter, used to name the cat according to the parameter, and one without parameters, in which case the name is simply "Cat". 
Another method for Cat is a non-parameterized method called purr that returns no value (void). 
Cats should be able to eat and sleep like in the first part.

PART4:
Finally, create an interface called NoiseCapable. It should define a non-parameterized method makeNoise that returns no value (void). 
Implement the interface in the classes Dog and Cat. 
The interface should take use of the bark and purr methods you've defined earlier.
 */

public class Main {

    public static void main(String[] args) {
        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();

    }

}
