/*
Create a class named Whistle. Add the variable private String sound to the class. 
After that, create the constructor public Whistle(String whistleSound), 
which is used to create a new whistle that's given a sound.
 */
public class Main {

    public static void main(String[] args) {

        //adds new whistle objects
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        //prints out the sound of the whistles
        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
}
