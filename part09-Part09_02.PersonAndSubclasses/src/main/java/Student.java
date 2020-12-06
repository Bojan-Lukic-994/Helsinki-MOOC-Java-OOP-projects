
public class Student extends Person {
    private int credits;

    //constructor for class Student
    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    //method that adds one credit to the amount
    public void study() {
        this.credits++;
    }

    //method that returns the amount of credits
    public int credits() {
        return this.credits;
    }

    //method that prints out name, address of the student and amount of credits
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "  Study credits " + this.credits;
    }
}
