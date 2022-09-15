package com.question1;

class Arithmetic {
    public int add(int num1, int num2) {
        return num1+num2;
    }
}
class Adder extends Arithmetic {

}
public class Q1 {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(10, 20));
    }
}