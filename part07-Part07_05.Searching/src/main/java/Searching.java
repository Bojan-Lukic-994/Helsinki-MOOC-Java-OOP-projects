/*
In the exercise template you'll find the class Book, ready for use. 
The class describes objects with a numeric id id and a name name.
In this exercise you will implement linear search and binary search algorithms for searching for books by their numeric id. 
In the exercise template you'll find the names of the methods to be implemented ready for you — 
at the moment these method always return -1 — you'll also find the Main method ready to be used for testing your methods.

PART1: The linear search algorithm works by checking every value in a list or an array one at a time, starting from index 0.
In the Main-class, implement a method public static int linearSearch(ArrayList<Book> books, int searchedId), 
which searches the list it received as a parameter, for a book with an id variable that matches the value of searchedId variable it received as a parameter. 
If that book is found, the method, should return the index it's located at in the list it received as a parameter. 
If the book isn't found, the method should return the value -1.

PART2: In the Main-class, implement a method public static int binarySearch(ArrayList<Book> books, int searchedId), 
which searches the list it received as a parameter, for a book with an id variable that matches the value of searchedId variable it received as a parameter. 
If that book is found the method, should return the index it's located at, in the list it received as a parameter. 
If the book isn't found, the method should return the value -1.
The method must be implemented as a binary search, which assumes the list is ordered. 
You should also assume, that the ids towards the beginning of the list, are always smaller than the ids towards the end of the list.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import static java.util.Comparator.comparing;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    //method that uses linear search to find the book with specified ID number (returns the book's index in list)
    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        //sets the index at 0
        int indexInList = 0;
        //searches for the book's id using linear search
        for (int i = 0; i < books.size(); i++) {
            //if the wanted book's id is found, book's index position is taken (and loop breaks)
            if (books.get(i).getId() == searchedId) {
                indexInList = i;
                break;
                //if the book is not found in the list, index is set at -1
            } else {
                indexInList = -1;
            }
        }
        //returns the index of the serached book
        return indexInList;
    }

    //method that uses binary search to find the book with specified ID number (returns the book's index in list)
    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        //sorts the list by id number (ascending)
        
        //initiates parameters - position in the list, low and high points for binary search
        int position = -1;
        int low = 0;
        int high = books.size() - 1;

        //searches for the position of the book
        while (low <= high) {
            int mid = (low + high) / 2;
            if (books.get(mid).getId() == searchedId) {
                position = mid;
                break;
            } else if (books.get(mid).getId() < searchedId) {
                low = mid + 1;
            } else if (books.get(mid).getId() > searchedId) {
                high = mid - 1;
            }
        }
        return position;
    }
}
