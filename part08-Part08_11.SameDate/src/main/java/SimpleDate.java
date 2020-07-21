
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    //method that compares the given dates
    public boolean equals(Object object) {
        //if variables are located in same place, they are the same
        if (this == object) {
            return true;
        }

        //if given object is not an instance of SimpleDate class, objects are not the same
        if (!(object instanceof SimpleDate)) {
            return false;
        }

        //converts object into an instance of SimpleDate class
        SimpleDate comparedObject = (SimpleDate) object;

        //if all parameters are the same, the objects are the same
        if (this.day == comparedObject.day && 
            this.month == comparedObject.month && 
            this.year == comparedObject.year) {
            return true;
        }
        return false;
    }

}
