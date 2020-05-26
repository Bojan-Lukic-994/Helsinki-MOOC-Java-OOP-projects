/*
There is a program in the exercise base that asks for books from the user and adds them to a list.

Modify the program so that books that are already on the list are not added to it again. 
Two books should be considered the same if they have the same name and publication year.
 */
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    //compares the two objects
    @Override
    public boolean equals(Object compared) {
        //checks if the values have the same spots - then objects are equal
        if (this == compared) {
            return true;
        }

        //checks if the given object is of type "Book"
        if (!(compared instanceof Book)) {
            return false;
        }

        //casts object to type "Book"
        Book comparedBook = (Book) compared;

        //checks if the objects values are the same
        if (this.name.equals(comparedBook.name) &&
            this.publicationYear == comparedBook.publicationYear) {
            return true;
        }

        //if nothing of this is true, objects are not the same
        return false;
    }
}
