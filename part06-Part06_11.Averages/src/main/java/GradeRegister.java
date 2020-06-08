
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    //method that returns the average of all exam grades
    public double averageOfGrades() {
        int gradesSum = 0;
        double gradesAverage = 0;
        //checks if there are any grades in the list, if not the program returns -1
        if (this.grades.size() == 0) {
            return -1;
        } else {
            //counts the sum of all grades
            for (Integer grade : this.grades) {
                gradesSum = gradesSum + grade;
            }
            //counts the average of all grades
            gradesAverage = (double) gradesSum / this.grades.size();
        }
        //returns the average of all grades
        return gradesAverage;
    }

    //method that returns the average of all exam points
    public double averageOfPoints() {
        int pointsSum = 0;
        double pointsAverage = 0;
        ////checks if there are any grades in the list, if not the program returns -1
        if (this.grades.size() == 0) {
            return -1;
        } else {
            //counts the sum of all exam points
            for (Integer points : this.points) {
                pointsSum = pointsSum + points;
            }
            //counts the average of all exam points
            pointsAverage = (double) pointsSum / this.grades.size();
        }
        //return the average of all points
        return pointsAverage;
    }
}
