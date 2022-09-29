package com.demo.lab;

public class FindCommonElements {
    // Main Method
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {10, 30, 40, 50, 70};
        int[] arr3 = {10, 20, 30, 40, 60};
        findElements(arr1, arr2, arr3); // calling findElements Method
    }
    public static void findElements(int[] arr1, int[] arr2, int[] arr3) {
        int n1 = arr1.length, n2 = arr2.length, n3 = arr3.length; // for storing lengths of arrays
        int i = 0, j =0, k = 0; // for storing starting index of arrays

        while (i < n1 && j < n2 && k < n3) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.println(arr1[i]);
                i++; j++; k++;
            }
            else if (arr1[i] < arr2[j]) { // if arr1[i] < arr2[j]
                i++;
            }
            else if (arr2[j] < arr3[k]) { // if arr2[j] < arr3[k]
                j++;
            }
            else {
                k++;
            }
        }
    }
}
