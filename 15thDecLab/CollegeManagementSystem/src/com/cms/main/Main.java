package com.cms.main;

import com.cms.navigation.MainMenu;

public class Main {

    // Main Method
    public static void main(String[] args) throws Exception {
        welcome();
        MainMenu.mainMenu();
    }

    // Welcome method
    public static void welcome() {
        System.out.println("Welcome To,");
        System.out.println("""
                           ℂ𝕠𝕝𝕝𝕖𝕘𝕖 𝕄𝕒𝕟𝕒𝕘𝕖𝕞𝕖𝕟𝕥 𝕊𝕪𝕤𝕥𝕖𝕞
                """);
    }
}
