package com.demo;
// Q.4 Write a Java program to break an integer into a sequence of individual digits.
import java.util.Scanner;
public class BreakInteger {
  public static void main(String args[]) {
    int n, temp, digit, count = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number: ");
    n = sc.nextInt();
    sc.close();
    temp = n;
    while (n > 0) {
      n = n / 10;
      count++;
    }
    while (temp > 0) {
      digit = temp % 10;
      System.out.println("Digit at place " + count + " is: " + digit);
      temp = temp / 10;
      count--;
    }
  }
}