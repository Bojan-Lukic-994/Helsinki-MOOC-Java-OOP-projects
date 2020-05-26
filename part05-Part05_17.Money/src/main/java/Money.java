
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    //returns a new money object with total amount of recieved object parameter plus object method
    public Money plus(Money addition) {
        Money otherMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return otherMoney;
    }

    //returns true if money-object on which method is called has less money than compared one
    public boolean lessThan(Money compared) {
        //checks if the amount of euros is the same or not
        Money otherMoney = new Money(this.euros, this.cents);
        if (otherMoney.euros < compared.euros) {
            return true;
        }
        //if the amount of euros is the same, checks the amount of cents
        if (otherMoney.euros == compared.euros) {
            if (otherMoney.cents < compared.cents) {
                return true;
            }
        }
        //if the amounts are different, returns false
        return false;
    }

    //
    public Money minus(Money decreaser) {
        /* first solution
        Money otherMoney = new Money(this.euros, this.cents);
        int euroDifference = this.euros - decreaser.euros();
        int centDifference = this.cents - decreaser.cents();
        int totalDifference = euroDifference * 100 + centDifference;
        
        if (totalDifference <= 0) {
            return new Money(0,0);
        } else {
            int eurosRtn = totalDifference / 100;
            int centsRtn = totalDifference % 100;
            return new Money (eurosRtn, centsRtn);
        }
         */

        //provided solution
        int euros = this.euros - decreaser.euros();
        int cents = this.cents - decreaser.cents();

        if (cents < 0) {
            cents = cents + 100;
            euros = euros - 1;
        }

        // if the value becomes negative, returns zero
        if (euros < 0) {
            return new Money(0, 0);
        }

        return new Money(euros, cents);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
