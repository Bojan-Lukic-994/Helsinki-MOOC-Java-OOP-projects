/*PART1:
European license plates have two parts: a two letter country code and a nationally unique license number. 
The license number is made up of numbers and characters.

We want to be able to save the license plates in ArrayLists and to use them as keys in a HashMap. 
This, as explained above, means that the equals and hashcode methods need to be overwritten, or they won't work as intended. 
Implement the methods equals and hashCode for the LicensePlate class.

PART2: Implement the class VehicleRegistry, which has the following methods:
public boolean add(LicensePlate licensePlate, String owner) assigns the owner it received as a parameter to a car that corresponds to the license plate received as a parameter. 
If the license plate doesn't have an owner, the method returns true. 
If the license already has an owner attached, the method returns false and does nothing.
public String get(LicensePlate licensePlate) returns the owner of the car corresponding to the license plate received as a parameter. 
If the car isn't in the registry, the method returns null.
public boolean remove(LicensePlate licensePlate) removes the license plate and attached data from the registry. 
The method returns true if removed successfully and false if the license plate wasn't in the registry.
*/
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        // the following is the same sample program shown in ex 8.13 description
        
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("Finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg
        
        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        // if the hasCode-method hasn't been overwritten, the owners won't be found
    }
}
