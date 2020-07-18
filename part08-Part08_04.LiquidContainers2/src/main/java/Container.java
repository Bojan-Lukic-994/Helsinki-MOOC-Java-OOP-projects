
public class Container {

    private int amount;

    //constructor for class "Container"
    public Container() {
        this.amount = 0;
    }

    //method that returns the amount of liquid in a container
    public int contains() {
        return this.amount;
    }

    //method that adds the amount of liquid to the container
    public void add(int amount) {
        //if sum of amounts is less than 0, adds inputed amount to the container
        if (amount > 0 && this.amount + amount <= 100) {
            this.amount += amount;
            //if amount in container exceeds 100 with added input, amount is set at 100
        } else {
            this.amount = 100;
        }
    }

    public void remove(int amount) {
        //if amount is not less than 0, removes inputed amount from the container
        if (amount > 0 && this.amount - amount >= 0) {
            this.amount -= amount;
            //if amount in container is less than 100 with removed input, amount is set at 0
        } else {
            this.amount = 0;
        }
    }

    //prints out the container in given form
    @Override
    public String toString() {
        return this.amount + "/100";
    }
}
