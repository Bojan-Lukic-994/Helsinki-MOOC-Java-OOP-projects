
public class Container {

    private int capacity;

    //constructor for class "Container"
    public Container() {
        this.capacity = 0;
    }

    //method that returns the amount of liquid in a container
    public int contains() {
        return this.capacity;
    }

    //returns the amount of the container
    public int getAmount() {
        return capacity;
    }

    //method that adds the amount of liquid to the container
    public void add(int amount) {
        //if sum of amounts is less than 0, adds inputed amount to the container
        if (amount > 0 && this.capacity + amount <= 100) {
            this.capacity += amount;
            //if amount in container exceeds 100 with added input, amount is set at 100
        } else {
            this.capacity = 100;
        }
    }

    //moves the amount from one container to the other
    public void move(int amount, Container container) {
        if (amount > 0) {
            if (this.capacity - amount >= 0) {
                container.add(amount);
                this.remove(amount);
            } else {
                container.add(this.capacity);
                this.remove(this.capacity);
            }
        }
    }

    public void remove(int amount) {
        //if amount is not less than 0, removes inputed amount from the container
        if (amount > 0 && this.capacity - amount >= 0) {
            this.capacity -= amount;
            //if amount in container is less than 100 with removed input, amount is set at 0
        } else {
            this.capacity = 0;
        }
    }

    //prints out the container in given form
    @Override
    public String toString() {
        return this.capacity + "/100";
    }
}
