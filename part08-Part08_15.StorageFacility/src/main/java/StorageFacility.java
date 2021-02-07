
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageFacility;
    private ArrayList<String> nonEmptyUnits;

    public StorageFacility() {
        this.storageFacility = new HashMap<>();
        this.nonEmptyUnits = new ArrayList<>();
    }

    //method that adds a new item to the given unit
    public void add(String unit, String item) {
        this.storageFacility.putIfAbsent(unit, new ArrayList<>());
        this.storageFacility.get(unit).add(item);
    }

    //method that removes the item from the storage unit
    public void remove(String storageUnit, String item) {
        this.storageFacility.get(storageUnit).remove(item);
    }

    //method that prints out the contents of the given storage unit
    public ArrayList<String> contents(String storageUnit) {
        //method returns empty list if there are no items in the unit
        if (!this.storageFacility.containsKey(storageUnit)) {
            return new ArrayList<>();
        }
        return this.storageFacility.get(storageUnit);
    }

    //method that prints out the units that are not empty
    public ArrayList<String> storageUnits() {
        for (String storageUnit : this.storageFacility.keySet()) {
            //checks if the unit is empty; if not, adds it to the list
            if (!this.storageFacility.get(storageUnit).isEmpty()) {
                this.nonEmptyUnits.add(storageUnit);
                continue;
            }
        }
        //returns the list of all non empty units
        return this.nonEmptyUnits;
    }
}
