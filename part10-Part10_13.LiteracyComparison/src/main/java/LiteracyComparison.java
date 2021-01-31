/*
This exercise uses open data about literacy levels, provided by UNESCO. 
The data includes statistics of estimated or reported levels of literacy for various countries for the past two years. 
File literacy.csv, included with the exercise template, includes the literacy estimates for women and men over 15 years of age. 
Each line in the file literacy.csv is as follows: "theme, age group, gender, country, year, literacy percent.

Create a program that first reads the file literacy.csv and then prints the contents from the lowest to the highest ranked on the literacy rate.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    // Theme, age group, gender, country, year, literacy percent.
    // Sort from lowest to highest ranked on the literacy percent
    public static void main(String[] args) {

        //creates new ArrayList of Literacy object
        ArrayList<Literacy> list = new ArrayList<>();

        //method that reads items from "literacy.csv" file and stores each row as separate item
        //all separate items are created as new Litearacy objecst and added to the list
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.trim())
                    .map(row -> row.split(","))
                    .filter(parts -> parts.length >= 6)
                    .map(parts -> new Literacy(parts[3], Integer.valueOf(parts[4]), parts[2].replace("(%)", "").trim(), Double.valueOf(parts[5])))
                    .forEach(literacy -> list.add(literacy));
        } catch (IOException e) {
            System.out.println("Error in reading file.");
        }

        //prints out all items from the file in sorted way (by literacy precent)
        list.stream().sorted().forEach(literacy -> System.out.println(literacy.toString()));
    }
}
