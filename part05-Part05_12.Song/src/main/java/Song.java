/*
In the exercise base there is a class called Song that can be used to create new objects that represent songs. 
Add to that class the equals method so that the similarity of songs can be examined.
 */
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    //compares if the songs are the same
    public boolean equals(Object compared) {
        //checks if the variables are in the same position
        if (this == compared) {
            return true;
        }

        //checks if the compared object is of type Song - if not, they are not equal
        if (!(compared instanceof Song)) {
            return false;
        }

        //converts object into a Song object
        Song comperedSong = (Song) compared;

        //checks if the values of the objects are equal
        if (this.artist.equals(comperedSong.artist)
                && this.name.equals(comperedSong.name)
                && this.durationInSeconds == comperedSong.durationInSeconds) {
            return true;
        }
        //otherwise object are not equals
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

}
