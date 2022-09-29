package com.demo.lab;

public class FindPairsOfElementsInArray {
    public static void main(String ... args)
    {
        findThePairs(new int[] {10, 32, 12, 3, 1, 4, 2, 45, 5, 10}, 50); // calling findThePairs Method
    }
    static void findThePairs(int[] inputArray, int inputNumber)
    {
        System.out.println("Pairs of elements are :: ");
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i+1; j < inputArray.length; j++) {
                if(inputArray[i]+inputArray[j] == inputNumber) {
                    System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
                }
            }
        }
    }
}
