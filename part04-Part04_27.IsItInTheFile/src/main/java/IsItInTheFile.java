/*
The exercise template comes with two files, names.txt and other-names.txt. 
Write a program that first asks the user for the name of the file to be read, 
after which the user is prompted for the string that they're looking for. 
The program then reads the file and searches for the desired string.

If the string is found, the program should print "Found!". 
If not, the program should print "Not found.". If reading the file fails (the reading ends in an error) 
the program should print the message "Reading the file " + file + " failed.".
 */
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        //asks for the name of the file
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        //scanner that reads from the file
        try (Scanner reader = new Scanner(Paths.get(file))) {
            //read all lines from the file - adds names from the file to the list
            while (reader.hasNextLine()) {
                list.add(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        //asks for the name to be searched
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        //searches for the name in the list, empty user input breaks the loop
        while (true) {
            if (searchedFor.isEmpty()) {
                break;
            }

            //prints out if the name is found in the list or not
            if (list.contains(searchedFor)) {
                System.out.println("Found!");
                break;
            } else {
                System.out.println("Not found!");
                break;
            }
        }
    }
}
