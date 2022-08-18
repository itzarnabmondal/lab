package com.demo;

// Q.2 Write a Java program to convert minutes into a number of years and days.

public class MinutesIntoNumberOfYearsAndDays {
	public static void main(String[] Strings) {
        double minutesInYear = 60 * 24 * 365;
        long min = 2646246928L;
        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;
        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
    }
}


