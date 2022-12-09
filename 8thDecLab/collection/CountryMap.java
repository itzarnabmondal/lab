package com.lab;

/*
1. 	Develop a java class with a instance variable CountryMap  HashMap (M1)
	add a method saveCountryCapital(String CountryName, String capital) ,
	the method should add the passed country and capital as key/value in
	the map M1 and return the Map (M1).

                    Key- Country				Value - Capital
                    India						Delhi
                    Japan						Tokyo

2. 	Develop a method getCapital(String CountryName) which returns the capital
	for the country passed from the Map M1 created in step 1.

3. 	Develop a method getCountry(String capitalName) which returns the country
	for the capital name passed from the Map M1 created in step 1.

4. 	Develop a method which iterates through the map M1 and creates another map
	M2 with Capital as the key and value as Country and returns the Map M2.

                    Key – Capital				Value – Country
                    Delhi						India
                    Tokyo						Japan

5. 	Develop a method which iterates through the map M1 and creates an ArrayList
	with all the Country names stored as keys. This method should return the ArrayList.

NOTE: You can test the methods using a main method.
 */


// importing necessary packages
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountryMap {
    private HashMap<String, String> M1;

    // Constructor
    public CountryMap() {
        M1 = new HashMap<>();
    }

    // saveCountryCapital() method
    public HashMap<String, String> saveCountryCapital(String CountryName, String capital) {
        M1.put(CountryName, capital);
        return M1;
    }

    // getCapital() method
    public String getCapital(String CountryName) {
        return M1.get(CountryName);
    }

    // getCountry() method
    public String getCountry(String capitalName) {
        Set<Entry<String, String>> set = M1.entrySet();
        // for each loop
        for (Entry<String, String> me : set) {
            if (me.getValue().equals(capitalName))
                return me.getKey();
        }
        // returning value
        return null;
    }

    // swapKeyValue()
    public HashMap<String, String> swapKeyValue() {
        HashMap<String, String> M2 = new HashMap<>();
        Set<Entry<String, String>> set = M1.entrySet();
        for (Entry<String, String> me : set) {
            M2.put(me.getValue(), me.getKey());
        }
        return M2;
    }

    // toArraylist
    public ArrayList<String> toArrayList() {
        ArrayList<String> list = new ArrayList<>();

        Set<Entry<String, String>> set = M1.entrySet();

        for (Entry<String, String> me : set) {
            list.add(me.getKey());
        }
        return list;
    }
}
