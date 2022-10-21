/**
 * Create a class MyCalculator which consists of a single method long power(int, int). 
 * This method takes two integers, n and p, as parameters and finds n^p . If either n or 
 * p is negative, then the method must throw an exception which says "n or p should 
 * not be negative.". Also, if both n and p are zero, then the method must throw an 
 * exception which says "n and p should not be zero."
 */
import java.util.Scanner;

class MyCalculator {
    // Creating power methods with all parameters.
    public long power(int n, int p) throws Exception {
        if (n == 0 && p == 0) // Checking Condition
            throw new Exception("n and p should not be zero.");
        else if (n < 0 || p < 0)
            throw new Exception("n or p should not be negative.");
        else
            return (long) (Math.pow(n, p)); // Casting result in long type.
    }

}

public class Question4 { // Main class
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) { // While loop
            int n = sc.nextInt();
            int p = sc.nextInt();

            try { // Code here may throw exceptions
                System.out.println(calc.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        sc.close(); // Closing Scanner
    }
}