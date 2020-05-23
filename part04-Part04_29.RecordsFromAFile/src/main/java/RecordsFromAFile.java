/*
In this exercise, we'll be working with files stored in CSV-format that contain names and ages separated by commas.
Your task is to write a program that first prompts the user for the name of the file they want to read. 
The program then prints the content of the file in the following way (we're assuming below that the output is from the above-mentioned file):
 */
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;

        //asks for the name of the file
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        //reads all lines from the file
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String item = reader.nextLine();

                //splits the lines and adds split values to name and age
                String[] parts = item.split(",");
                name = parts[0];
                age = Integer.valueOf(parts[1]);

                //prints out all items from the file
                System.out.println(name + ", " + "age: " + age + " years");
            }

            //prints out the exception if it occurs
        } catch (Exception e) {
            System.out.println("Reading file " + file + " failed");
        }

    }
}
