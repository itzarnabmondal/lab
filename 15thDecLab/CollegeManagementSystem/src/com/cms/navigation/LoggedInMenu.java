package com.cms.navigation;

// Importing necessary packages
import com.cms.operations.*;

import java.util.Scanner;

public final class LoggedInMenu {

    // logged in menu after logged in

    public static void loggedInmenu() throws Exception {

        if (StudentInfo.isIsLoggedIn()) {

            System.out.println("""
                Enter 1 for take admission
                Enter 2 to view you profile
                Enter 3 for delete account
                Enter 0 for go back to main menu
                """);

            char input = new Scanner(System.in).next().charAt(0);

            switch (input) {
                case '1' -> TakeAddmission.takeAdmission();
                case '2' -> Profile.profile();
                case '3' -> DeleteAccount.deleteAccount();
                case '0' -> MainMenu.mainMenu();
                default -> {
                    System.out.println("Oh No! Wrong Input, Please try again :)");
                    LoggedInMenu.loggedInmenu();
                }
            }
        }

    }
}
