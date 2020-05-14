/*PART1:Define a method called printSpaces(int number) that produces the number of spaces specified by number. 
The method does not print the line break.
PART2:Create a method called printTriangle(int size) that uses printSpaces and printStars to print the correct triangle.
PART3:Define a method called christmasTree(int height) that prints the correct Christmas tree. 
The Christmas tree consists of a triangle with the specified height as well as the base. 
The base is two stars high and three stars wide, and is placed at the center of the triangle's bottom. 
The tree is to be constructed by using the methods printSpaces and printStars.*/

public class AdvancedAstrology {

    //prints out the given number of stars
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    //prints out the spaces
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    //prints out a right leaning triangle
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    //prints the christmas three of stars
    public static void christmasTree(int height) {
        //prints out the tree of stars
        int j = height - 1;
        for (int i = 1; i <= height * 2; i += 2) {
            printSpaces(j);
            printStars(i);
            j--;
        }

        //prints out the base of the tree
        printSpaces(height - 2);
        printStars(3);
        printSpaces(height - 2);
        printStars(3);
    }

    public static void main(String[] args) {

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
