
public class Container {

    private int containerLiquid;

    //constructor for class "Container"
    public Container() {
        this.containerLiquid = 0;
    }

    //method that returns the amount of liquid in container
    public int contains() {
        return this.containerLiquid;
    }

    //method that adds given amount to the container
    public void add(int amount) {
        //doesn't do anything if value of the amount is less or equal to 0
        if (amount > 0) {
            //adds amount to the container
            if (this.containerLiquid + amount <= 100) {
                this.containerLiquid += amount;
            } else { // the limit of the container is 100
                this.containerLiquid = 100;
            }
        }
    }

    //method that removes the given amount from the container
    public void remove(int amount) {
        //doesn't do anything if value of the amount is less or equal to 0
        if (amount > 0) {
            //removes amount to the container
            if (this.containerLiquid - amount >= 100) {
                this.containerLiquid -= amount;
            } else { // amount in the container can't go below 0
                this.containerLiquid = 0;
            }
        }
    }

    //prints out the amount of liquid in the container
    public String toString() {
        return "" + this.containerLiquid + "/" + 100;
    }
}
