package com.cms.operations;

// Importing necessary packages
import com.cms.db.DbConnection;
import com.cms.navigation.LoggedInMenu;
import com.cms.navigation.MainMenu;
import com.cms.security.DestroySession;
import com.cms.security.Pin;
import com.cms.security.Security;
import com.cms.validation.Captcha;
import com.cms.validation.FetchHash;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteAccount {

    // Password counter variable
    private static byte invalidPasswordCounter = 0;

    // Method to delete account
    public static void deleteAccount() throws Exception {
            verify();
    }

    public static void verify() throws Exception {
        System.out.println("Are you sure ? (Enter 'Y' for YES any other key for NO: )");
        char input = new Scanner(System.in).next().charAt(0);
        if (input == 'Y' || input == 'y') {

            // Calling Captcha
            Captcha.captcha();

            // Telling customer to enter password again
            enterPassword();

        }
        else {
            LoggedInMenu.loggedInmenu();
        }

    }



    private static void enterPassword() throws Exception {

        // Terminate condition for max password attempt
        if (invalidPasswordCounter >= 3) {
            System.out.println("Oh No! You reached max attempt");
            System.out.println("Bye :)");
            DestroySession.destroy();
            MainMenu.mainMenu();
        }

        // Taking password input and storing it into a variable
        System.out.println("Enter Your Password to verify it's you: ");
        StudentInfo.setPasswordHash(Security.getSha256(new Scanner(System.in).next()));

        // Checking, Password matching or not
        if (StudentInfo.getPasswordHash().equalsIgnoreCase(FetchHash.fetchPasswordHash(StudentInfo.getStudentId()))) {

            // Code if password matching with database
            StudentInfo.setPasswordHash(null);
            invalidPasswordCounter = 0; // resetting invalid password counter for pin

            // Checking Pin Enabled OR NOT
            if (Pin.checkIsEnabled(StudentInfo.getStudentId())) {

                // If pin enabled, Calling Enter Pin method
                enterPin();

            } else {

                // If pin not enabled then,
                System.out.println("You are successfully logged in :) ");
                StudentInfo.setIsLoggedIn(true);
                LoggedInMenu.loggedInmenu();
            }

        }else {

            // If password not matching with database
            StudentInfo.setIsLoggedIn(false);
            invalidPasswordCounter++;
            System.out.println("Oh No! Wrong password, Pleases try Again");
            enterPassword();
        }

    }

    // Method for take pin during login
    public static void enterPin() throws Exception {

        // Terminate condition for max PIN attempt
        if (invalidPasswordCounter > 3) {
            System.out.println("Oh No! You reached max attempt");
            System.out.println("Bye :)");
            DestroySession.destroy();
            MainMenu.mainMenu();
        }

        System.out.println("Enter Your Pin: ");
        StudentInfo.setPinHash(Security.getMd5(Security.getBase64(new Scanner(System.in).next())));

        // Matching Pin hash with pin has in database
        if (Pin.verifyPin(StudentInfo.getPinHash(), StudentInfo.getStudentId())) {

            // If all verification successfully calling delete
            delete();

        }
        else {
            System.out.println("Oh No! Wrong PIN, Pleases try Again: ");
            enterPin();
            invalidPasswordCounter++;
        }
    }

    // Delete method to delete account
    private static void delete() throws Exception {


        // Creating statement object and executing delete operation
        Statement st = DbConnection.connect().createStatement();
        byte count = (byte) st.executeUpdate("delete from students where id="+ StudentInfo.getStudentId());

        // Showing result
        if (count > 0) {

            // Calling destroy method to clear all data stored on variables
            DestroySession.destroy();

            // Showing msg
            System.out.println("Your account successfully deleted from our database");
            System.out.println("GoodBye :) ");

            // Calling main menu
            MainMenu.mainMenu();
        }
    }
}
