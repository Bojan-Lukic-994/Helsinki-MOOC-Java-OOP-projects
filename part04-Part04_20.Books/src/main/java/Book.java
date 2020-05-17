/*
Write a program that first reads book information from the user. 
The details to be asked for each book include the title, the number of pages and the publication year. 
Entering an empty string as the name of the book ends the reading process.

After this the user is asked for what is to be printed. 
If the user inputs "everything", all the details are printed: the book titles, the numbers of pages and the publication years. 
However, if the user enters the string "name", only the book titles are printed.

It is probably worthwhile to implement a class called Book to represent a book. 
There are two points in total available for this exercise.
 */
public class Book {

    private String title;
    private int pages;
    private int publicationYear;

    //constuctor for class "Book"
    public Book(String title, int pagesNumber, int publicationYear) {
        this.title = title;
        this.pages = pagesNumber;
        this.publicationYear = publicationYear;
    }

    //returns the title of the book
    public String getTitle() {
        return this.title;
    }

    //return the number of pages of the book
    public int getPages() {
        return this.pages;
    }

    //return the year of publication of the book
    public int getPublicationYear() {
        return this.publicationYear;
    }

    //return the informations of the book
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }

}
