package com.lab;

/*
1. Develop a java class with a instance variable Country HashSet (H1) add a method storeCountryNames(String CountryName),
the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
2. Develop a method retrieveCountry(String CountryName) which iterates through the HashSet and returns the country if exist else return null.
*/

import java.util.HashSet;
import java.util.Iterator;

public class Country {
    // Creating hashset
    HashSet<String> H1 = new HashSet<>();
    public HashSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName); // adding countries
        return H1;
    }
    // Get country method
    public String getCountry(String CountryName) {
        Iterator<String> it = H1.iterator(); // Iterating

        while (it.hasNext()) {
            if (it.next().equals(CountryName))
                return CountryName; // returning value
        }
        return null; // returning value
    }
}