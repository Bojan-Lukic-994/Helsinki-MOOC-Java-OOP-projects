import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registy;
    
    public VehicleRegistry() {
        this.registy = new HashMap<>();
    }

    //method that assigns a new owner to the license plate (if it doesn't have one)
    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.registy.containsKey(licensePlate)) {
            return false;
        }
 
        this.registy.put(licensePlate, owner);
        return true;
    }

    //method that returns the owner of the car corresponding to the given license plate
    public String get(LicensePlate licensePlate) {
        return this.registy.get(licensePlate);
    }

    //method that removes the license plate and attached data if the license plate is in the registry
    public boolean remove(LicensePlate licensePlate) {
        if (this.registy.containsKey(licensePlate)) {
            this.registy.remove(licensePlate);
            return true;
        }
        
        return false;
    }

    //method that prints out all license plates from the registry
    public void printLicensePlates() {
        for (LicensePlate key : this.registy.keySet()) {
            System.out.println(key);
        }
    }

    //method that prints out all the owners of the cars
    public void printOwners() {
        //creates new empty list of owners
        ArrayList<String> owners = new ArrayList<>();
        
        //filters all owners and ads it to the list
        for (String owner : this.registy.values()) {
            if (owners.contains(owner)) {
                continue;
            } else {
                owners.add(owner);
            }
        }
        
        //prints all the owners of the cars
        for (String item : owners) {
            System.out.println(item);
        }
    }
}

