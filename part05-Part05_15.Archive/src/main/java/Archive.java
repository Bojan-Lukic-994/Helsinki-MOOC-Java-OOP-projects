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
public class Archive {

    private String identifier;
    private String name;

    //constructor for class "Archive"
    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    //returns the identifier
    public String getIdentifier() {
        return this.identifier;
    }

    //returns the name
    public String getName() {
        return this.name;
    }

    //compares the two objects
    @Override
    public boolean equals(Object compared) {
        //checks if the values have the same spots - then objects are equal
        if (this == compared) {
            return true;
        }

        //checks if the given object is of type "Archive"
        if (!(compared instanceof Archive)) {
            return false;
        }

        //casts object to type "Archive"
        Archive comparedArchive = (Archive) compared;

        //checks if the objects have the same identifier
        if (this.identifier.equals(comparedArchive.identifier)) {
            return true;
        }

        //if nothing of this is true, objects are not the same
        return false;
    }
}
