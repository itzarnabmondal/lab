package com.lab;

import java.util.HashMap;

public class Main {

    // main method for executing all operations
    public static void main(String[] args) {

        // for problem 1
        System.out.println(":: Problem 1 ::");
        var obj = new EvenNumbers();
        obj.storeEvenNumbers(10);
        obj.retriveEvenNumbers();

        // for problem 2
        System.out.println("\n:: Problem 2 ::");
        // Creating country object
        var countries = new Country();
        // Adding Countries
        countries.saveCountryNames("India");
        countries.saveCountryNames("USA");
        countries.saveCountryNames("Pakistan");
        countries.saveCountryNames("Bangladesh");
        countries.saveCountryNames("China");
        // Printing details
        System.out.println("China: " + countries.getCountry("China"));
        System.out.println("Japan: " + countries.getCountry("Japan"));

        // for problem 3
        System.out.println("\n:: Problem 3 ::");
        CountryMap countryMap = new CountryMap();
        // Calling saveCountryCapital() method
        countryMap.saveCountryCapital("India", "Delhi");
        countryMap.saveCountryCapital("Japan", "Tokyo");
        countryMap.saveCountryCapital("USA", "Washington, D.C.");
        // Printing value by calling methods
        System.out.println(countryMap.getCapital("India"));
        System.out.println(countryMap.getCountry("Tokyo"));
        System.out.println(countryMap.toArrayList());
        HashMap<String, String> M2 = countryMap.swapKeyValue();
        System.out.println(M2);

    }
}
