
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance += increase;
    }

    public boolean takeMoney(double amount) {
        //does withdrawal if the money left is 0 or bigger
        if (this.balance - amount >= 0) {
            this.balance = this.balance - amount;
            return true;
        }
        return false;
    }
}
