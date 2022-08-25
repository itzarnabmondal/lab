/* Q3. Java program to print pyramid pattern using ‘*’. */

import java.util.Scanner;

public class PyramidStarPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt(); sc.close();
        System.out.println();

        for (int i=1; i<=rows; i++) {
            for (int j=rows; j>i; j--) {
                System.out.print(" ");
            }

            for (int k=1; k<=(i * 2) -1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}