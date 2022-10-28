public class Problem3 {

    public static void main(String[] args) { // Main method
        System.out.println(addTwoPositive(10, 20)); // Calling addTwoPositive 
    }

    public static int addTwoPositive(int num1, int num2) throws ArithmeticException {
        if (num1 < 0 || num2 < 0) { // Checking condition.
            throw new ArithmeticException("Non-positive integers sent!"); // Throwing new Arithmetic Exception

        } else {
            return num1 + num2; // Returning sum
        }
    }
}