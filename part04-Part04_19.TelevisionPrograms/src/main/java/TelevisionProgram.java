/*
In the exercise template there is a ready-made class TelevisionProgram, representing a television program. 
The class has object variables name and duration, a constructor, and a few methods.

Implement a program that begins by reading television programs from the user. 
When the user inputs an empty string as the name of the program, the program stops reading programs.

After this the user is queried for a maximum duration. Once the maximum is given, 
the program proceeds to list all the programs whose duration is smaller or equal to the specified maximum duration.
*/
public class TelevisionProgram {

    private String name;
    private int duration;

    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public boolean isAwesome() {
        return this.name.contains("MasterChef");
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.duration + " minutes";
    }
}
