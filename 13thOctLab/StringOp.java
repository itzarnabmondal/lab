package com.demo;

import java.util.StringTokenizer;

public class StringOp {
	public static void main(String[] args) {
		String s1 = "Welcome to Java World";
		String s2 = "Welcome";
		String s3 = " - Let us learn";
		System.out.println("Character at 5th index: " + s1.charAt(5));
		System.out.println("Result of comparing: " + s1.compareToIgnoreCase(s2));
		System.out.println(s1 + s3);
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.replaceAll("a", "e"));
		System.out.println(s1.substring(4, 10));
		System.out.println(s1.toLowerCase());
		StringBuffer sb = new StringBuffer("This is a StringBuffer");
		System.out.println(sb.append("- This is a sample program"));
		System.out.println(sb.replace(16, 22, "Builder"));
		System.out.println(sb.insert(21, "Object"));
		System.out.println(sb.reverse());
		String str = "C:/IBM/DB2/PROGRAM/DB2COPY1.EXE";
		StringTokenizer st = new StringTokenizer(str);
		System.out.println("Drive:" + st.nextToken("/"));
		System.out.println("Folders : " + st.nextToken("/") + " || " + st.nextToken("/") + " || " + st.nextToken("/"));
		System.out.println("File: " + st.nextToken("/"));
	}
}
