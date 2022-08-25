/* Q2. Java Program to Check Whether a Number is Prime or Not. */

import java.util.Scanner;

public class ProgramToCheckInputPrimeOrNot {
    public static void main(String[] args)
    {
        int i, number, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Any Integer : ");
        number = sc.nextInt();

        for (i = 2; i <= number/2; i++) {
            if(number % i == 0) {
                count++;
                break;
            }
        }
        if(count == 0 && number != 1 )
            System.out.println( number + " is a Prime Number.");
        else
            System.out.println(number + " is Not A Prime Number.");
    }
}