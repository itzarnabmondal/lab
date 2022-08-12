import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        // For taking input from users
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd Number: ");
        int num3 = sc.nextInt();
        System.out.println("Enter 4th Number: ");
        int num4 = sc.nextInt();
        System.out.println("Enter 5th Number: ");
        int num5 = sc.nextInt();
        // For calculating the average
        int avg = (num1+num2+num3+num4+num5)/5;
        System.out.println("Avarage of 5 number is: "+avg);

    }
}