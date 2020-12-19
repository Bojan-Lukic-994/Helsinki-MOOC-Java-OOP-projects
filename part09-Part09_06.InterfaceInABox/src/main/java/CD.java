
public class CD implements Packable {
    private String artist;
    private String name;
    private int year;
    private final double weight;
    
    //constructor for class CD
    public CD(String cdArtist, String cdName, int yearOfPublication) {
        this.artist = cdArtist;
        this.name = cdName;
        this.year = yearOfPublication;
        this.weight = 0.1;
    }

    //method that returns the weight of the CD
    public double weight() {
        return this.weight;
    }
    
    @Override
    //method that prints out the cd's author, name and year of publication
    public String toString() {
        return (this.artist + ": " + this.name + " (" + this.year + ")");
    }

    
}
