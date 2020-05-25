
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public int price() {
        return this.squares * this.princePerSquare;
    }

    //compares the sizes of the apartments
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    //finds the difference in price between apartments (returns the absolute value of the difference)
    public int priceDifference(Apartment compared) {
        return Math.abs(this.price() - compared.price());
    }

    //finds out which apartment is more expensive
    public boolean moreExpensiveThan(Apartment compared) {
        if (this.price() > compared.price()) {
            return true;
        } else {
            return false;
        }
    }
}
