/*
PART1:
Use regular expressions to create the method public boolean isDayOfWeek(String string), 
which returns true if the parameter string is an abbreviation of a day of the week (mon, tue, wed, thu, fri, sat, sun)

PART2:
NB. For simplicity's sake, in this exercises the letters that are considered vowels are: a, e, i, o, and u.
Create the method public boolean allVowels(String string) that uses a regular expression to check whether all the characters in the parameter string are vowels.

PART3:
Create the method public boolean timeOfDay(String string). 
It should use a regular expression to check whether the parameter string expresses a time of day in the form hh:mm:ss (hours, minutes, and seconds each always take up two spaces).
NB. In this exercise we use the 24-hour clock. So the acceptable values are between 00:00:00 and 23:59:59.
*/

public class MainProgram {

    public static void main(String[] args) {
        Checker check = new Checker();
        check.timeOfDay("05:58:31");
    }
}
