//package com.cms.navigation;
//
//// Importing necessary packages
//import com.cms.operations.CreateAccount;
//import com.cms.security.Login;
//import com.cms.security.ResetPassword;
//
//import java.util.Scanner;
//
//public class MainMenu {
//    public static void mainMenu() throws Exception {
//        System.out.println("""
//                Enter 1 for create account
//                Enter 2 for login
//                Enter 3 for reset password
//                """);
//        char input = new Scanner(System.in).next().charAt(0);
//        switch (input) {
//            case '1' -> CreateAccount.createAccount();
//            case '2' -> Login.login();
//            case '3' -> ResetPassword.resetPassword();
//            default -> {
//                System.out.println("Wrong Input!");
//                mainMenu();
//            }
//        }
//    }
//}
