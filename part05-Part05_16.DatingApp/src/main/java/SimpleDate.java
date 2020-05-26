/*
With the exercise base the class SimpleDate is supplied. 
The date is stored with the help of the object variables year, month, and day.

PART1: Implement the method public void advance() that moves the date by one day. 
In this exercise we assume that each month has 30 day. NB! In certain situations you need to change the values of month and year.

PART2: Implement the method public void advance(int howManyDays) that moves the date by the number of days that is given. 
Use the method advance() that you implemented in the previous section to help you in this.

PART3: Let's add the possibility to advance time to the SimpleDate class. 
Create the method SimpleDate afterNumberOfDays(int days) for the class. 
It creates a new SimpleDate object whose date is the specified number of days greater than the object that the method was called on. 
You may still assume that each month has 30 days. Notice that the old date object must remain unchanged!
 */
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //moves the date by one day
    public void advance() {
        this.day++;
        //checks if the number of days are over 30, if yes the next month starts
        if (this.day > 30) {
            this.month++;
            this.day = 1;
        }
        //checks if the number of months are over 12, if yes the next year starts
        if (this.month > 12) {
            this.year++;
            this.month = 1;
        }
    }

    //advances the given number of days
    public void advance(int howManyDays) {
        for (int i = 0; i < howManyDays; i++) {
            advance();
        }
    }

    //creates new SimpleDate object with greater number of days
    public SimpleDate afterNumberOfDays(int days) {
        //creates new SipmleDate object with cloned parameters
        SimpleDate novi = new SimpleDate(this.day, this.month, this.year);
        //increases the number of days and returns the objects
        novi.advance(days);
        return novi;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

}
