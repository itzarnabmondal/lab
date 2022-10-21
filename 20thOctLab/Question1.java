/**
 * Q1.
 * You are given a piece of Java code. You have to complete the code by writing down the handlers 
 * for exceptions thrown by the code. The exceptions the code may throw along with the handler 
 * message are listed below:
 * Division by zero: Print "Invalid division".
 * String parsed to a numeric variable: Print "Format mismatch".
 * Accessing an invalid index in string: Print "Index is invalid".
 * Accessing an invalid index in array: Print "Array index is invalid".
 * MyException: This is a user defined Exception which you need to create. It takes a 
 * parameter param. When an exception of this class is encountered, the handler should print "My 
 * Exception[param]", here param is the parameter passed to the exception class.
 * Exceptions other than mentioned above: Any other exception except the above ones fall in this 
 * category. Print "Exception encountered".
 * Finally, after the exception is handled, print "Exception Handling Completed".
 */
import java.util.Scanner;
import java.lang.Exception;

class MyException extends Exception { // Creating MyException class
    private int param;

    MyException(int a) { // Constructor
        param = a;
    }

    public String toString() { // To String Method
        return "MyException[" + param + "]";
    }
}

public class Question1 {
    // This method may throw an exception
    static void solve(int arr[]) throws Exception {
        int ans = 0;

        for (int i = 0; i < 10; i++)
            for (int j = i + 1; j < 10; j++)
                ans += arr[i] / arr[j];

        throw new MyException(ans);
    }

    public static void main(String args[]) { // Main Method
        try { // Code here, may throw an exception
            Scanner in = new Scanner(System.in); // Creating scanner object
            int n = in.nextInt();
            int[] arr = new int[n];
            in.nextLine();
            for (int i = 0; i < 10; i++)
                arr[i] = Integer.parseInt(in.nextLine());

            String s = in.nextLine(); // Taking user input
            System.out.println(s.charAt(10));

            solve(arr);
        } catch (ArrayIndexOutOfBoundsException e) { // Handling app possible exceptions
            System.out.println("Array index is invalid");
        } catch (NumberFormatException e) {
            System.out.println("Format mismatch");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is invalid");
        } catch (ArithmeticException e) {
            System.out.println("Invalid division");
        } catch (MyException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Exception encountered");
        } finally {
            System.out.println("Exception Handling Completed");
        }
    }
}