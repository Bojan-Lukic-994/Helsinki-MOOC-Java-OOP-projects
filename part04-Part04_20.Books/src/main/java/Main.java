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
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        //creates new arraylsist of books
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //enters the books name; if the name is empty, the list stops entering items
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }
            //enters number of pages of the book 
            System.out.println("Pages: ");
            int pageNumber = Integer.valueOf(scanner.nextLine());

            //enters the book's publication year
            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            //adds new Book items to the list
            books.add(new Book(title, pageNumber, publicationYear));
        }

        System.out.println("What information will be printed?");
        String answer = scanner.nextLine();

        //choses which informations will be printed
        for (Book book : books) {
            if (answer.equals("everything")) {
                System.out.println(book);
            }
            if (answer.equals("name")) {
                System.out.println(book.getTitle());
            }

        }
    }
}
