package com.demo;

import java.util.Scanner;

public class AdvanceArithmatic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = scanner.nextInt(); scanner.close();
		MyCalculator.divisor_sum(input);	
	}
}
class MyCalculator {
	static void divisor_sum(int n) {
		int sum = 0;
        for(int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i; 
            }
        }
        System.out.println("Result is: "+sum);
	}
}



