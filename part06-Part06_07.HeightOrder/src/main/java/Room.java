
import java.util.ArrayList;

public class Room {

    ArrayList<Person> list = new ArrayList<>();

    //constructor for class "Room"
    public Room() {
        this.list = new ArrayList<>();
    }

    //method that adds a new person to the list
    public void add(Person person) {
        this.list.add(person);
    }

    //method that checks if the room is empty or not
    public boolean isEmpty() {
        //returns true if room is empty
        if (this.list.isEmpty()) {
            return true;
            //returns false if room is not empty
        } else {
            return false;
        }
    }

    //method that returns all persons from the list
    public ArrayList<Person> getPersons() {
        return this.list;
    }

    //method that returns the shortest person in the room
    public Person shortest() {
        //checks if the list is empty, if it is then program returns null
        if (this.list.isEmpty()) {
            return null;
        }
        //creates new Person object, shortest - it is first from the list
        Person shortest = this.list.get(0);

        //iterates throught the list
        for (Person person : this.list) {
            //finds the shortest person in the list
            if (shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }
        //returns the shortest person in the list
        return shortest;
    }

    //method that removes the shortest person from the list
    public Person take() {
        //creates new Person object - the shortest from the list
        Person shortest = this.shortest();
        //removes the shortest person from the list
        this.list.remove(shortest);
        return shortest;
    }
}
