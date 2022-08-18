package com.demo;
/*
Q.1 Write a Java program to find the value of specified expression. 
a) 101 + 0) / 3
b) 3.0e-6 * 10000000.1
c) true && true
d) false && true
e) (false && false) || (true && true)
f) (false || false) && (true && true)
*/
public class ValueOfSpecifiedExpression {
	public static void main(String[] args) {
		
		int a1=1000, a2=100, a3=2; // Exp1
		double b1=5.6, b2=782.27; // Exp2
		boolean c1=true, c2=true; // Exp3
		boolean d1=false, d2=true; // Exp4
		boolean e1=false, e2=false, e3=true, e4=true; // Exp5
		boolean f1=false, f2=false, f3=true, f4=true; // Exp6 
		
		System.out.println("("+a1+" + "+a2+" / "+a3+") = "+(a1+a2)/a3);
		System.out.println("("+b1+" * "+b2+") = "+ (b1 * b2));
		System.out.println("("+b1+" && "+b2+") = "+(c1 && c2));
		System.out.println("("+d1+" && "+d2+") = "+(d1 && d2));
		System.out.println("("+e1+" && "+e2+" || "+e3+" && "+e4+") = "+((e1 && e2) || (e3 && e4)));
		System.out.println("("+f1+" || "+f2+" && "+f3+" && "+f4+") = "+((f1 || f2) && (f3 && f4)));
		
	}
}
