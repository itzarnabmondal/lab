/**
 * Q2. WAJP to find longest word in a file.
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LongWord {
    public static void main(String [ ] args) throws FileNotFoundException {
        LongestWords(); // Calling LongestWord method
    }
    public static String LongestWords() throws FileNotFoundException { // Method for find long word
        String longWord = ""; // Declaring 2 variables
        String currentWord;
        Scanner scan = new Scanner(new File("demo.txt")); // Scanner obj creating
        while (scan.hasNext()) { // Checking condition
            currentWord = scan.next();
            if (currentWord.length() > longWord.length()) {
                longWord = currentWord;
            }
        }
        System.out.println(longWord); // Printing result
        return longWord;
    }
}