package com.demo;

public class Rectangle {
	private int length, breadth;
	public Rectangle() {}
	public Rectangle(int l, int b) {
		length = l;
		breadth = b;
		System.out.println("Area = "+(length*breadth));
		System.out.println("Updating the value of length & Breadth Variable ...");
		length = 110;
		breadth = 160;
		System.out.println("New area = "+(length*breadth));
	}
}
class RectangleTest {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Rectangle rectangle = new Rectangle(100, 150);
	}
}