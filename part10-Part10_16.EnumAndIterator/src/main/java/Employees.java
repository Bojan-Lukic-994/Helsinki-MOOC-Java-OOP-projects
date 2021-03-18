
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private ArrayList<Person> employees;

    //constructor for class Employees
    public Employees() {
        this.employees = new ArrayList<>();
    }

    //method that adds the given person to the list of employees
    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    //method that adds all persons from the given list to the list of employees
    public void add(List<Person> peopleToAdd) {
        for (Person person : peopleToAdd) {
            this.employees.add(person);
        }
    }

    //method that prints out all employees
    public void print() {
        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //method that prints out employees with the education same as the given parameter
    public void print(Education education) {
        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()) {
            Person nextInLine = iterator.next();
            if (nextInLine.getEducation().equals(education)) {
                System.out.println(nextInLine);
            }
        }
    }

    //method that removes (fires) all employees with the same education as the given parameter
    public void fire(Education education) {
        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation().equals(education)) {
                iterator.remove();
            }
        }
    }
}
