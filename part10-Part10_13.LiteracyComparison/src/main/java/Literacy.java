/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bojan Lukic
 */
class Literacy implements Comparable<Literacy> {
    private String country;
    private int year;
    private String gender;
    private double litaracy;

    //constructor for class Literacy
    public Literacy(String country, int year, String gender, double literacy) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.litaracy = literacy;
    }

    //method that returns the literacy precent
    public double getLitaracy() {
        return litaracy;
    }

    //method that compares Literacy objects by literacy precentage
    @Override
    public int compareTo(Literacy literacy) {
        return (int) Double.compare(this.getLitaracy(), literacy.getLitaracy());
    }

    //method that prints out Literacy object as String
    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.litaracy;
    }
}
