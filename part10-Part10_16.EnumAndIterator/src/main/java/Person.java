
public class Person {
    private String name;
    private Education education;
    
    //constructor for class Person
    public Person(String name, Education education) {
        this.name = name;
        this.education = education;
    }
    
    //method that returns the education
    public Education getEducation() {
        return this.education;
    }
    
    //returns the Person object as a string representation
    public String toString() {
        return this.name + ", " + this.education;
    }
}
