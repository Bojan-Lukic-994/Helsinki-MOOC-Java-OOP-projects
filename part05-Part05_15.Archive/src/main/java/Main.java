/*
In this exercise you get to implement a program that can be used to handle an archive. 
Several items can be added to it. When no more items are added, all the items in the archive are printed.

PART1: The program should read items from the user. 
When all the items from the user have been read, the program prints the information of each item.

For each item, its identifier and name should be read. 
If the identifier or name is empty, the program stops asking for input, and prints all the item information.

PART2: Modify the program so that after entering the items, each item is printed at most once. 
Two items should be considered the same if their identifiers are the same 
(there can be variation in their names in different countries, for instance).
If the user enters the same item multiple times, the print uses the item that was added first.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //creates new ArrayList of "Archive" objects
        ArrayList<Archive> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //adds new Archive objects to the list
        while (true) {
            //asks for the identifier and adds it
            System.out.println("Identifier? (empty will stop) ");
            String identifier = scanner.nextLine();
            if (identifier.equals("")) {
                break;
            }

            //asks for the name and adds it
            System.out.println("Name? (empty will stop) ");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }

            //adds new Archive objects to the list if they do not exist already in it
            Archive archive = new Archive(identifier, name);
            if (!list.contains(archive)) {
                list.add(archive);
            }
        }
        //prints out all objects from the list - in form "identifier: name"
        System.out.println("==Items==");
        for (Archive arc : list) {
            System.out.println(arc.getIdentifier() + ": " + arc.getName());
        }
    }
}
