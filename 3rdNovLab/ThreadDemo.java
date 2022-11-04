package com.demo;
import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void main(String[] args) throws Exception {
        List<Integer> numbers = new ArrayList<>(); // Creating arraylist

        double startTime = 0, endTime = 0;
        startTime = System.currentTimeMillis(); // capturing starttime
        for (int i = 0; i <= 10000000; i++) {
            numbers.add(i);
        }
        endTime = System.currentTimeMillis(); // capturing end time
        System.out.println("Total Required Time for Storing: " + (endTime - startTime)); // calculating total time

        for (int i = 0; i < 10000000; i++) {
            numbers.add(i);
        }
        Thread t1 = new Thread(new Runnable() { // Thread 1
            public void run() {
                for (int i = 0; i <= 5000000; i++) {
                    System.out.println(numbers.get(i));
                }
            }
        });
        Thread t2 = new Thread(new Runnable() { // Thread 2
            public void run() {
                for (int i = 5000000; i <= 10000000; i++) {
                    System.out.println(numbers.get(i));
                }
            }
        });
        startTime = 0; endTime = 0; // making zero
        startTime = System.currentTimeMillis();
        t1.start(); // Starting Threads
        t2.start();
        t1.join(); // Joint for stoping excuting main thread
        t2.join();
        startTime = System.currentTimeMillis();
        System.out.println("Total required time using thread: " + (startTime - endTime));
    }
}
