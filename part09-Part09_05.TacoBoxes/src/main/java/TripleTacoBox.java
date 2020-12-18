
public class TripleTacoBox implements TacoBox {
    private int tacos;
    
    //constructor for class TripleTacoBox
    public TripleTacoBox() {
        this.tacos = 3;
    }
    
    //method that reduces the number of tacos by 1
    public void eat() {
        //checks if the value of tacos is equal or less than 0, if it is, it doesn't reduce the number of tacos
        if (this.tacos <= 0) { 
            return;
        }
        //reduces the number of tacos by 1
        this.tacos--;
    }
    
    //method that returns the number of remaining tacos
    public int tacosRemaining() {
        return this.tacos;
    }
}
