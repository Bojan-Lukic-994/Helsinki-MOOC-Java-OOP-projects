/*
TASK :Write a program that reads user input for books and their age recommendations.
The program asks for new books until the user gives an empty String (only presses enter). 
After this, the program will print the number of books, their names, and their recommended ages.

PART1:
Implement the reading and printing the books first, the ordering of them doesn't matter yet.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        //method that adds new Book items to the list of books
        while (true) {

            //user inputs the name of the book
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();

            //blank inputs breaks the loop
            if (name.isEmpty()) {
                break;
            }

            //user inputs the age recommendation for the book
            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());

            //adds a new Book item to the list of books (parameters are given name and age recommendation)
            books.add(new Book(name, age));
        }

        //method that prints out the total count of the books
        System.out.println(books.size() + " books in total.");

        //method that prints out all the books from the list in sorted order
        System.out.println("Books:");
        books.stream().sorted().forEach(book -> System.out.println(book));
    }
}
