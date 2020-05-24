/*
Two classes, Person and Pet, are included in the exercise template. 
Each person has one pet. Modify the public String toString method of the Person class 
so that the string it returns tells the pet's name and breed in addition to the person's own name.
*/
public class Pet {

    private String name;
    private String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

}
