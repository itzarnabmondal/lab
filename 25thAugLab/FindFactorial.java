/* Q1.  Write a java program to find the factorial of a number. */

import java.util.Scanner;

public class FindFactorial {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt(); sc.close();
        int fact=1;
        for(int i=1;i<=num;i++)
            fact=fact*i;
        System.out.println("Factorial of "+num+" Is: "+fact);
    }
}



