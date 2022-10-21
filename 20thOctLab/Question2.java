/**
 * Wite a program in Java to create a file in Java using Exception Handling.
 */
import java.io.File;
import java.io.IOException;

public class Question2 { // Main class
    public static void main(String args[]) { // Main method
        try {
            File file = new File("Arnab.m"); // Creating file class object
            if (file.createNewFile()) { // cheacking if this file exist or not
                System.out.println("File " + file.getName() + " is created successfully.");
            } else {
                System.out.println("File is already exist in this directory.");
            }
        } catch (IOException exception) { // Handling excptions
            System.out.println("An error is occurred.");
            exception.printStackTrace();
        }
    }
}
