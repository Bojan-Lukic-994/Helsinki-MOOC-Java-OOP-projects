/*
Create a class Abbreviations for managing common abbreviations. 
The class must have a constructor, which does not take any parameters. The class must also provide the following methods:

public void addAbbreviation(String abbreviation, String explanation) adds a new abbreviation and its explanation.

public boolean hasAbbreviation(String abbreviation) checks if an abbreviation has already been added; 
returns true if it has and false if it has not.

public String findExplanationFor(String abbreviation) finds the explanation for an abbreviation; 
returns null if the abbreviation has not been added yet.
 */

import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> map;

    //constructor for class "Abbreviations" - empty constructor
    public Abbreviations() {
        this.map = new HashMap<>();
    }

    //method that adds new abbreviation to the hash map
    public void addAbbreviation(String abbreviation, String explanation) {
        this.map.put(abbreviation, explanation);
    }

    //method that checks if hash map contains given abbreviation
    public boolean hasAbbreviation(String abbreviation) {
        return this.map.containsKey(abbreviation);
    }

    //method that finds an explanation for given abbreviation
    public String findExplanationFor(String abbreviation) {
        return this.map.get(abbreviation);
    }
}
