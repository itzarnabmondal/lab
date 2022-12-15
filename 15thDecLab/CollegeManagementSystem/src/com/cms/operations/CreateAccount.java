package com.cms.operations;

// Importing necessary packages
import com.cms.db.DbConnection;
import com.cms.security.*;
import com.cms.security.RecoveryKey;
import com.cms.validation.Captcha;
import com.cms.validation.Validation;
import java.sql.PreparedStatement;
import java.util.Random;
import java.util.Scanner;

public class CreateAccount {

    // For storing inputs taken by scanner
    private static char input;

    // Method to create account
    public static void createAccount() throws Exception {

        // Calling enter name method
        enterName();

        // Calling enter phone number method
        enterPhoneNumber();

        // Calling enter password method
        enterPassword();

        // Calling Captcha
//        Captcha.captcha();

        // Generating accountNo
        StudentInfo.setStudentId(new Random().nextInt(99999999));

        // Generating recovery key
        String tempRecoveryKey = RecoveryKey.generateRecoveryKey();

        // Generating recovery key hash
        StudentInfo.setRecoveryKeyHash(Security.getSha256(tempRecoveryKey));

        // Asking customer wants to create a pin or not
        System.out.println("""
                Do you want to create a PIN for additional security ?
                [Pin provides extra security, your have to enter your pin
                before various purposes like Transfer money, Withdraw money etc. ]
                If yes enter Y else enter any other character
                """);

        input = new Scanner(System.in).next().charAt(0);

        // Checking customer wants to create pin or not
        if (input == 'Y' || input == 'y') {
            enterPin();
            StudentInfo.setIsPinEnabled(true);
        } else {
            StudentInfo.setIsPinEnabled(false);
        }

        // Storing customer data into database
        PreparedStatement ps = DbConnection.connect().prepareStatement("insert into bankinfo values(?,?,?,?,?,?,?,?)");
        // Setting values
        ps.setInt(1, StudentInfo.getStudentId());
        ps.setString(2, StudentInfo.getName());
        ps.setLong(3, StudentInfo.getPhone());
        ps.setString(4, StudentInfo.getPasswordHash());
        ps.setString(5, StudentInfo.getRecoveryKeyHash());
        ps.setString(6, StudentInfo.getPinHash());
        ps.setBoolean(7, StudentInfo.isIsPinEnabled());
        ps.setString(8, "null");
        ps.executeUpdate(); // For executing

        // Closing statement
        ps.close();

        // Account Created message
        System.out.println("""
                Account Successfully Created :)
                Use following credentials to login into your account
                Thank you for using our service :)
                """);
        System.out.println("Your Registration id is: "+ StudentInfo.getStudentId());
        System.out.println("Account recovery key: "+ tempRecoveryKey);
        System.out.println("NOTE: Save your recovery key in a safe place,\nIf you forgot password you need this to resetting your password");

        // Pausing screen
        System.out.println("Please Enter any key to continue :) ");
        char tempEntry = new Scanner(System.in).next().charAt(0);

        // Destroying session and telling user to login
        DestroySession.destroy();
        System.out.println("Please login your account :) ");
        Login.login();
    }

    // Enter name method
    public static void enterName() {
        System.out.println("Enter your full name: ");
        Validation.nameValidation(new Scanner(System.in).nextLine());
    }

    // Enter Phone number method
    public static void enterPhoneNumber() {

        System.out.println("Enter your 10 digit phone number: ");
        // Passing input into phone validation method
        Validation.phoneValidation(new Scanner(System.in).next());
    }

    // Enter password method
    public static void enterPassword() throws Exception {

        System.out.println("Please Enter Your new password");
        System.out.println("""
                NOTE:
                * Password length must be between 8-20 characters.
                * Password must contains a lowercase letter, one digit,
                * one uppercase character and one spacial character.
                """);

        // Taking user input and passing into takeInput method of password class
        Password.takeInput(new Scanner(System.in).next());
    }

    // Enter PIN Method
    public static void enterPin() {

        System.out.println("""
                Your pin length should be 4-6 digits,
                No character or whitespace allowed!
                """);
        System.out.println("Enter your Pin");

        // Passing pin into take input method of pin class
        Pin.takeInput(new Scanner(System.in).next());
    }
}