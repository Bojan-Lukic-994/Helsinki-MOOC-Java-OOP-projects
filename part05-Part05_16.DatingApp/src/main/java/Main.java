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
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);

        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week = week + 1;
        }

        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
        //    System.out.println("Try " + date.afterNumberOfDays(790));
    }
}
