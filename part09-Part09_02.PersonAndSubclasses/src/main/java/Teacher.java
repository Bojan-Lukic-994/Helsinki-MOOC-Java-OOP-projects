
public class Teacher extends Person {

    private int salary;

    //constructor for class Teacher
    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    //method that prints out the teacher's name, address and salary
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "  salary " + this.salary + " euro/month";
    }
}
