package com.demo;

public class FindSequ {

	public static String validate(String input) {
		if (input.matches("[a-z]+_[a-z]+")) {
			return "Match Found";
		} else {
			return "Match Not Found";
		}
	}

	public static void main(String... args) {
		System.out.println(validate("arnab_mondal"));
		System.out.println(validate("Arnab_Mondal"));
		System.out.println(validate("Arnab_mondal"));
	}

}
