
import java.util.ArrayList;

public class BirdDatabase {

    private ArrayList<Bird> birds;

    //constructor for class "BirdDatabase"
    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }

    //method that adds new Bird object to the BirdDatabase
    public void addBird(String birdName, String birdLatinName) {
        this.birds.add(new Bird(birdName, birdLatinName));
    }

    //method that adds an observation to the given bird
    public boolean observation(String birdName) {
        //if bird is found in the list, an observation for that bird is added
        for (Bird bird : this.birds) {
            if (bird.getName().equals(birdName)) {
                bird.addObservation();
                return true;
            }
        }
        return false;
    }

    //method that returns out all birds from the list
    public String getAllBirds() {
        //adds all birds from the list to string item
        String allBirds = "";
        for (Bird bird : this.birds) {
            allBirds += bird.toString();
        }
        //returns all birds from the list
        return allBirds;
    }

    //method that returns one (searched) bird from the list
    public String getOne(String birdName) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(birdName)) {
                return bird.toString();
            }
        }
        return null;
    }

}
