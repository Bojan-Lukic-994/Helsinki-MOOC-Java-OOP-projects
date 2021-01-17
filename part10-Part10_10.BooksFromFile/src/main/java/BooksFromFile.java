/*
Add the method public static List<Book> readBooks(String file) for the class BooksFromFile. 
It should read the file given as the parameter and forms book data from it.

The exercise template contains the class Book, which is used for describing a book. 
You should presume that the book files are in the following format:
name,publishing year,page count,author

The name and the author of the book are processed as strings, and the publishing year and the page count are processed as integers.
*/

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    
    //method that reads Books item from the given file and returns them as a list of Book items
    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 4)
                    .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
                    .forEach(book -> books.add(book));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return books;
    }

}
