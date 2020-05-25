
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private final double eatAffordably = 2.50;
    private final double eatHeartily = 4.30;

    //constructor for class "PaymentTerminal"
    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    //eat affordably by paying with cash
    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        if (payment - eatAffordably >= 0) {
            //cash is reduced, money goes to payment terminal and number of affordable meals increases by 1
            payment = payment - eatAffordably;
            this.money = this.money + eatAffordably;
            this.affordableMeals++;
        }
        return payment;
    }

    //eat affordably by paying with payment card
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        if (card.balance() >= eatAffordably) {
            //cash is taken from credit card and amount of affordable meals is increased by 1
            card.takeMoney(eatAffordably);
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    //eat heartily by paying with cash
    public double eatHeartily(double payment) {
        // an hearty meal costs 4.30 euros
        if (payment - eatHeartily >= 0) {
            //cash is reduced, money goes to payment terminal and number of hearty meals increases by 1
            payment = payment - eatHeartily;
            this.money = this.money + eatHeartily;
            this.heartyMeals++;
        }
        return payment;
    }

    //eat heartily by paying with payment card
    public boolean eatHeartily(PaymentCard card) {
        // an hearty meal costs 4.30 euros
        if (card.balance() >= eatHeartily) {
            //cash is taken from credit card and amount of hearty meals is increased by 1
            card.takeMoney(eatHeartily);
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    //adds amount of money to the payment card
    public void addMoneyToCard(PaymentCard card, double sum) {
        //adds money to the payment card, also recieved payment is stored in register (payment terminal)
        if (sum > 0) {
            card.addMoney(sum);
            this.money = this.money + sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
