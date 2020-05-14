/*
Create a class named Room. Add the variables private String code and private int seats to the class. 
Then create a constructor public Room(String classCode, int numberOfSeats) 
through which values are assigned to the instance variables.

@author Bojan Lukic
 */
public class Room {

    private String code;
    private int seats;

    //constructor for the class "Room"
    public Room(String classCode, int numberOfSeats) {
        this.code = classCode;
        this.seats = numberOfSeats;
    }
}