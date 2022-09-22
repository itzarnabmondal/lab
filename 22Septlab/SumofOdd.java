import java.util.Scanner;
public class SumofOdd {
    public static void main(String[] args) {
        int number, i, oddSum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter any Number: ");
        number = sc.nextInt(); sc.close();

        for (i = 1; i <= number; i++) { // for calculating sum of odd numbers
            if (i % 2 != 0) {
                oddSum = oddSum + i;
            }
        }
        System.out.println("\n The Sum of Odd Numbers upto " + number + "  =  " + oddSum);
    }
}