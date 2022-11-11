/**
 * Q3. WAJP to store text file content line by line into an array.
 */

import java.io.BufferedReader; // importing all necessary classes
import java.io.FileReader;
import java.util.ArrayList;

public class StoreInArray { // main class
    public static void main(String[] args) throws Exception { // main method
        ArrayList<String> arrayList = new ArrayList<>(); // creating arraylist
        BufferedReader bufferedReader = new BufferedReader(new FileReader("demo.txt")); // creating buffered reader object
        String currentLine; // string variable
        while((currentLine = bufferedReader.readLine()) != null) // condition
            arrayList.add(currentLine);
        bufferedReader.close(); // closing resources
        System.out.println(arrayList); // printing elements
    }
}

