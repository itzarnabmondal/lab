package com.demo;

import java.util.regex.*;

public class ValidateIp {
	public static void main(String args[]) {
		System.out.println("Output: " + check("000.12.12.034")); // Case 1
		System.out.println("Output: " + check("121.234.12.12")); // Case 2
		System.out.println("Output: " + check("000.12.234.23.23")); // Case 3
		System.out.println("Output: " + check("i.am.not.an.ip")); // Case 4
	}

	public static boolean check(String ip) {
		String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
		String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
		Pattern p = Pattern.compile(regex);
		if (ip == null) { // if empty return false
			return false;
		}
		Matcher m = p.matcher(ip);
		return m.matches(); // For return if the IP if matched
	}
}
