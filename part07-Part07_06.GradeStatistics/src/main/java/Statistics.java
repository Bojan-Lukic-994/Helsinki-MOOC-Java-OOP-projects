import java.util.ArrayList;
 
public class Statistics {
 
    private ArrayList<Integer> pointTotals;
 
    //constructor for class Statistics
    public Statistics() {
        this.pointTotals = new ArrayList<>();
    }
 
    //method that adds points to the list if they are in range
    public void addAllPoints(int pointTotal) {
        if (pointTotal < 0 || pointTotal > 100) {
            return;
        }
        this.pointTotals.add(pointTotal);
    }
 
    //method that print the statistics for the given user input - given points
    public void print() {
        double sum = 0;
        double passingSum = 0;
        int numberOfPassing = 0;
 
        //calculates the sum of all points
        for (Integer points : pointTotals) {
            sum += points;
 
            //calculates the number of passing grades
            if (points >= 50) {
                passingSum += points;
                numberOfPassing++;
            }
        }
        
        //prints out the average of all points and average points of passing grades
        System.out.println("Point average (all): " + sum / this.pointTotals.size());
        if (numberOfPassing > 0) {
            System.out.println("Point average (passing): " + passingSum / numberOfPassing);
        } else {
            System.out.println("Point average (passing): -");
        }
        
        //prints out the pass precentage
        System.out.println("Pass percentage: " + (100.0 * numberOfPassing / this.pointTotals.size()));
 
        //prints out the grade distribution in stars
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + printStars(i));
        }
    }
 
    //method that print the number of grades in the list as stars
    private String printStars(int grade) {
        int howManyStars = 0;
        for (Integer points : pointTotals) {
            if (convertToGrade(points) == grade) {
                howManyStars++;
            }
        }
 
        return stars(howManyStars);
    }
 
    //method that converts the number of grades into stars
    private String stars(int n) {
        String stars = "";
        for (int i = 0; i < n; i++) {
            stars += "*";
        }
        return stars;
    }
 
    //method that converts given points from the list to grades
    private int convertToGrade(int pointAmount) {
        int grade = 5;
 
        if (pointAmount < 50) {
            grade = 0;
        } else if (pointAmount < 60) {
            grade = 1;
        } else if (pointAmount < 70) {
            grade = 2;
        } else if (pointAmount < 80) {
            grade = 3;
        } else if (pointAmount < 90) {
            grade = 4;
        }
        //returns the grades in the list
        return grade;
    }
 
}
 