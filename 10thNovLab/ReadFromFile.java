/**
 * @Arnab Mondal
 * Q1. WAJP to read 3 lines from a file
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws IOException { // main method
        String line = null; // declaring a string variable
        BufferedReader bufferedReader = new BufferedReader(new FileReader("demo.txt")); // creating buffered reader object
        int i = 0;
        while (((line = bufferedReader.readLine()) != null) && i < 3) { // while loop for condition
            System.out.println(line); // pointing data
            i++;
        }
        bufferedReader.close(); // closing
    }
}
