/*
Two classes, Person and Pet, are included in the exercise template. 
Each person has one pet. Modify the public String toString method of the Person class 
so that the string it returns tells the pet's name and breed in addition to the person's own name.
*/
public class Person {

    private String name;
    private Pet pet;

    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public Person(String name) {
        this(name, new Pet("Toothless", "dragon"));
    }

    public Person() {
        this("Lilo", new Pet("Stitch", "blue alien"));
    }

    @Override
    public String toString() {
        return this.name + ", has a friend called " + this.pet.getName() + "(" + this.pet.getBreed() + ")";
    }

}
