package com.cms.operations;

import com.cms.db.DbConnection;
import com.cms.navigation.LoggedInMenu;

import java.sql.Statement;
import java.util.Scanner;

public class TakeAddmission {

    public static void takeAdmission() throws Exception {
        classXandXIImarksCheck();
    }

    public static void classXandXIImarksCheck() throws Exception {
        byte tempXper=0, tempXIIper=0;

        System.out.println("Enter your 10th percentage: ");
        try {
            tempXper = new Scanner(System.in).nextByte();
            if (tempXper < 1 || tempXper > 100) throw new RuntimeException();
        }catch (Exception e) {
            System.out.println("Oh No! Wrong input please try again");
            classXandXIImarksCheck();
        }

        System.out.println("Enter your 12th percentage: ");

        try {
            tempXIIper = new Scanner(System.in).nextByte();
            if (tempXIIper < 1 || tempXIIper > 100) throw new RuntimeException();
        }catch (Exception e) {
            System.out.println("Oh No! Wrong input please try again");
            classXandXIImarksCheck();
        }

        if (tempXper > 70 && tempXIIper > 70) {
            // calling select course method
            selectCourse();
        }
        else {
            System.out.println("Oh No! you are no eligible\nYou need minimum 70% marks to take admission");
        }
    }

    // Select course
    public static void selectCourse() throws Exception {
        String tempDept=null;
        System.out.println("""
                Enter 1 for b.sc physics honours
                Enter 2 for b.sc chemistry honours
                Enter 3 for b.sc mathematics honours
                Enter 4 for b.sc biology honours
                """);
        char tempInput = new Scanner(System.in).next().charAt(0);
        switch (tempInput) {
            case '1' -> tempDept = "b.sc physics honours";
            case '2' -> tempDept = "b.sc chemistry honours";
            case '3' -> tempDept = "b.sc mathematics honours";
            case '4' -> tempDept = "b.sc biology honours";
            default -> {
                System.out.println("Oh No! Wrong Input, Please try again");
                selectCourse();
            }
        }

        // calling update method;
        updateDept(tempDept);
    }

    private static void updateDept(String dept) throws Exception {
        try (Statement statement = DbConnection.connect().createStatement()) {
            statement.executeUpdate("update students set dept="+dept+" where id="+StudentInfo.getStudentId());
            System.out.println("You successfully got enrolled");
            LoggedInMenu.loggedInmenu();
        }
    }
}
