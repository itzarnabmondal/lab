/**
 * Write a program to create custom exception in java.
 */
class MyException extends Exception {
    public MyException(String msg) {
        // Pass the message to parent class constructor
        super(msg);
    }
}

public class Question3 { // Main Class
    public static void main(String args[]) {
        try {
            throw new MyException("My Exception "); // Throws an object of MyException
        } catch (MyException ex) {
            System.out.println(ex.getMessage());

            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
    }
}