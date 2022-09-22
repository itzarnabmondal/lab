import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        double num1, num2 = 0D;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        num1 = sc.nextDouble();
        System.out.println("Enter 2nd Number: ");
        num2 = sc.nextDouble();
        sc.close();
        System.out.println("Addition is: " + addition(num1, num2));
        System.out.println("Subtraction is: " + subtraction(num1, num2));
        System.out.println("Multiplication is: " + multiplication(num1, num2));
    }
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }
}