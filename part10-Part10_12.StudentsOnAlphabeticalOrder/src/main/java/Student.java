

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    //method that compares the names of the students
    @Override
    public int compareTo(Student student) {
        return this.getName().compareToIgnoreCase(student.getName());
    }

    @Override
    public String toString() {
        return name;
    }

}
