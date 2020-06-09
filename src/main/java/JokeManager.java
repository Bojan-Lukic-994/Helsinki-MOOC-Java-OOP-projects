
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokeManager = new ArrayList<>();

    //constructor for class "JokeManager"
    public JokeManager() {
        this.jokeManager = new ArrayList<>();

    }

    //method that adds joke to the manager
    public void addJoke(String joke) {
        this.jokeManager.add(joke);
    }

    //method that returns random joke from the manager
    public String drawJoke() {
        //returns message if it manager is empty
        if (this.jokeManager.isEmpty()) {
            return "Jokes are in short supply.";
            //returns random joke from manager
        } else {
            return this.jokeManager.get(new Random().nextInt(this.jokeManager.size()));
        }
    }

    //method that prinst out all jokes from the list
    public void printJokes() {
        for (String joke : this.jokeManager) {
            System.out.println(joke);
        }
    }
}
