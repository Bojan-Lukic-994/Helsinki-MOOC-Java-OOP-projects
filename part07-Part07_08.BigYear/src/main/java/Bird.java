
public class Bird {

    private String name;
    private String latinName;
    private int observations;

    public Bird(String birdName, String birdLatinName) {
        this.name = birdName;
        this.latinName = birdLatinName;
        this.observations = 0;
    }

    //method that returns the name of the bird
    public String getName() {
        return this.name;
    }

    //method that returns the latin name of the bird
    public String getLatinName() {
        return this.latinName;
    }

    //method that returns the number of observations of the bird
    public int getObservations() {
        return this.observations;
    }

    //method that increases the number of observations by 1
    public void addObservation() {
        this.observations++;
    }


    //method that prints out the Bird object as a string
    @Override
    public String toString() {
        return this.name + "(" + this.latinName + "): " + this.observations + " observations";
    }
}
