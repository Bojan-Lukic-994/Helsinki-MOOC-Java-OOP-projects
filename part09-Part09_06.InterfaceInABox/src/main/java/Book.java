
public class Book implements Packable {
    private String author;
    private String name;
    private double weight;
    
    
    //constructor for class Book
    public Book(String bookAuthor, String bookName, double bookWeight) {
        this.author = bookAuthor;
        this.name = bookName;
        this.weight = bookWeight;
    }
    
    //method that returns the weight of the Book
    public double weight() {
        return this.weight;
    }
    
    //method that prints out the book's author and book's name
    public String toString() {
        return (this.author + ": " + this.name);
    }

}
