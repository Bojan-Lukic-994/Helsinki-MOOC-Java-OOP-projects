/*
Create a "Book" class that describes a book. Each book has an author, title, and page count.

Make the class a:
Constructor public Book(String author, String name, int pages)
Method public String getAuthor() that returns the book's author's name.
Method public String getName() that returns the name of the book.
Method public int getPages() that returns the number of pages in the book.

In addition, make a public String toString() method for the book that will be used to print the book object.
 */
public class Book {

    private String bookAuthor;
    private String bookName;
    private int bookPages;

    //constructor for class "Book"
    public Book(String author, String name, int pages) {
        this.bookAuthor = author;
        this.bookName = name;
        this.bookPages = pages;
    }

    //returns the author of the book
    public String getAuthor() {
        return this.bookAuthor;
    }

    //returns the name of the book
    public String getName() {
        return this.bookName;
    }

    //returns the number of pages of the book
    public int getPages() {
        return this.bookPages;
    }

    //prints out the book's informations (author, name and number of pages)
    public String toString() {
        return this.getAuthor() + ", " + this.getName() + ", " + this.getPages() + " pages";
    }
}
