
public class Checker {

    //method that cheks if the given string is abbreviation of a day of the week
    public boolean isDayOfWeek(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    //checks if the string is made only of vowels
    public boolean allVowels(String string) {
        return string.matches("[aeiou]*");
    }
    
    //method that checks if the given string expresses a time of the day
    public boolean timeOfDay(String string) {
        return string.matches("([01][0123456789]|2[0123]):[012345][0123456789]:[012345][0123456789]");
    }
}
