
public class CustomTacoBox implements TacoBox {
    private int tacos;
    
    //constructor for class CustomTacoBox
    public CustomTacoBox(int customTacos) {
        this.tacos = customTacos;
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
