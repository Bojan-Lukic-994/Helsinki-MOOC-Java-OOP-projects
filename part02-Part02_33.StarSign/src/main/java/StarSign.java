//PART1: Define a method called printStars that prints the given number of stars and a line break.
//PART2: Define a method called printSquare(int size) that prints a suitable square with the help of the printStars method. 
//PART3: Write a method called printRectangle(int width, int height) that prints the correct rectangle by using the printStars method. 
//PART4: Create a method called printTriangle(int size) that prints a triangle by using the printStars method.

public class StarSign {

    public static void main(String[] args) {
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

    //prints out the number of stars in a row
    public static void printStars(int number) {
        int i = 1;
        while (number >= i) {
            System.out.print("*");
            i += 1;
        }
        System.out.println("");

    }

    //prints out the square of stars
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //prints out the rectangle of stars
    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    //prints out the trianle of stars
    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
