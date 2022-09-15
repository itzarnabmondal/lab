package com.Question2;

class Teacher {
    String designation = "Professor";
    String collegeName = "XYZ institute of Tech";

    void work() {
        System.out.println("Teaching");
    }
}

class IT_Teacher extends Teacher {
    String mainSubject = "Javascript";
}

public class Q2 {
    public static void main(String[] args) {
        IT_Teacher obj = new IT_Teacher();
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        obj.work();
    }
}