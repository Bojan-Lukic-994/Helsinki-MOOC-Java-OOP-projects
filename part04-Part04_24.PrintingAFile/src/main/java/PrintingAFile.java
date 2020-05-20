/*
Write a program that prints the contents of a file called "data.txt", such that each line of the file is printed on its own line.
 */
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {

        //gets the data to read from
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))) {
            //reads from the file until all the lines are read
            while (scanner.hasNextLine()) {
                String item = scanner.nextLine();
                System.out.println(item);
            }
            //catches the possible error and prints it out
        } catch (Exception e) {
            System.out.println("Error is: " + e.getMessage());
        }
    }
}
