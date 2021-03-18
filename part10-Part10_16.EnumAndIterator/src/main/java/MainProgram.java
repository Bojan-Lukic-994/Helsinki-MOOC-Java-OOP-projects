/*
PART1: Make an enumerated type (enum) Education. 
It should have the enumerators PHD (Doctoral degree), MA (Masters degree), BA (Bachelors degree) and HS (High School diploma).

PART2: Make a class Person. The Person constructor takes a name and the education as parameters. 
A Person has a method public Education getEducation(), which returns the education of the person.

PART3: Make a class Employees. Employees -object contains a list of Person -objects. 
The class has a constructor which takes no parameters, and the following methods:
public void add(Person personToAdd) adds the given person to the employees list
public void add(List<Person> peopleToAdd) adds the given list of people to the employees list
public void print() prints all employees
public void print(Education education) prints the employees whose education matches the education given as a parameter.
 */
public class MainProgram {

    public static void main(String[] args) {
        Employees university = new Employees();
        university.add(new Person("Petrus", Education.PHD));
        university.add(new Person("Arto", Education.HS));
        university.add(new Person("Elina", Education.PHD));

        university.print();

        university.fire(Education.HS);

        System.out.println("==");

        university.print();
    }
}
