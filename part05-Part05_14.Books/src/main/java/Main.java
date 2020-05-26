
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);

            //checks if the objects are the same
            if (books.contains(book)) {
                //if objects are not the same, prints out the message 
                System.out.println("The book is already on the list. Let's not add the same book again.");
            } else {
                books.add(book); //if objects are the same, adds them to the list
            }
        }
        // NB! Don't alter the line below!
        System.out.println(
                "Thank you! Books added: " + books.size());

    }
}
