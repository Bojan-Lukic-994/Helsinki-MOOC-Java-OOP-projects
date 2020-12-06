
public class Person {

    private String name;
    private String address;

    //constructor for class Person
    public Person(String personName, String personAddress) {
        this.name = personName;
        this.address = personAddress;
    }

    //method that prints out name and address of the person
    public String toString() {
        return this.name + "\n"
                + "  " + this.address;
    }
}
