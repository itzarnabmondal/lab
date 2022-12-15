package com.cms.security;

// Importing necessary packages
import com.cms.operations.CreateAccount;
import com.cms.operations.StudentInfo;
import com.cms.validation.AccountExistOrNot;
import com.cms.validation.Captcha;
import com.cms.validation.FetchHash;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ResetPassword {
    private static byte invalidKeyCounter = 0;
    public static void resetPassword() throws Exception {
        DestroySession.destroy();

        // Calling enter account no method
        enterAccountNo();

    }

    // Taking account no
    public static void enterAccountNo() throws Exception {
        try {
            System.out.println("Enter Your Account No: ");
            StudentInfo.setStudentId(Integer.parseInt(new Scanner(System.in).next()));
            //
            enterPhoneNumber();
        } catch (NumberFormatException e) {
            System.out.println("Wrong Input! Account number can contains number only");
            enterAccountNo();
        }
    }

    public static void enterPhoneNumber() throws Exception {
        System.out.println("Enter Registered phone number: ");
        try {
            StudentInfo.setPhone(new Scanner(System.in).nextLong());
        }catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Wrong Input! Enter your 10 digit phone number: ");
            enterPhoneNumber();
        }

        // Calling Verify
        verify();
    }

    private static void verify() throws Exception {
        if (AccountExistOrNot.check(StudentInfo.getStudentId(), StudentInfo.getPhone())) {
            // if caustomer present in database asking for enter amount
            Captcha.captcha();

        } else {
            System.out.println("No account found with these details :( ");
            System.out.println("Please enter correct details");
            enterAccountNo();
        }

        // Calling enter recoveryKey
        enterRecoveryKey();
    }

    public static void enterRecoveryKey() throws Exception {
        System.out.println("Enter 32 characters recovery key: ");
        StudentInfo.setRecoveryKeyHash(Security.getSha256(new Scanner(System.in).next()));
        if (StudentInfo.getRecoveryKeyHash().equalsIgnoreCase(FetchHash.fetchRecoveryKeyHash(StudentInfo.getStudentId()))) {
            CreateAccount.enterPassword();
            // Updating passwordhash in database
            Password.updatePassword();
        }
        else {
            invalidKeyCounter++;
            System.out.println("Oh No! This recovery key isn't valid\nPlease try again");
        }

    }
}
