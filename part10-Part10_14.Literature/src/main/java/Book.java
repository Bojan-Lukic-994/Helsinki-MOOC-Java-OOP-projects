
public class Book implements Comparable<Book>{
    private String name;
    private int ageRecommendation;
    
    //constructor for class Book
    public Book(String name, int ageRecommendation) {
        this.name = name;
        this.ageRecommendation = ageRecommendation;
    }

    //method that returns the name of the book
    public String getName() {
        return name;
    }

    //method that returns the recommended age for the book
    public int getAgeRecommendation() {
        return ageRecommendation;
    }
    
    //method that sorts the book by age recommendation (from lowest to largest) and then by the name (alphabetical order)
      @Override
    public int compareTo(Book book) {
        
        //if books have the same age recommendation, compares them by name
        if (this.ageRecommendation == book.ageRecommendation) {
            return this.name.compareTo(book.name);
        }
        
        return this.ageRecommendation - book.ageRecommendation;
    }  
    
     //method that prints the book (form name + age recommendation)
    @Override
    public String toString(){
        return this.name + " (recommended for " + this.ageRecommendation + " year-olds or older)";
    }
}
