//package com.cms.operations;
//
//// Importing necessary packages
//import com.cms.db.DbConnection;
//import com.cms.navigation.LoggedInMenu;
//import com.cms.security.Login;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class CheckBalance {
//
//    // Method to print balance of current customer
//    public static void checkBalance() throws Exception {
//
//        // Checking is customer logged in or not
//        if (StudentInfo.isIsLoggedIn()) {
//
//            // Creating statement and executing query
//            Statement statement = DbConnection.connect().createStatement();
//            ResultSet rs = statement.executeQuery("select balance from bankinfo where accountno="+ StudentInfo.getStudentId());
//            rs.next();
//
//            // Displaying result
//            System.out.println("Your Current Balance Is: "+rs.getDouble("balance"));
//
//            // Going back to logged in menu
//            LoggedInMenu.loggedInmenu();
//        }
//
//        // If not logged in
//        else {
//            System.out.println("Dear Customer, At first log in into your account: ");
//            Login.login();
//        }
//    }
//}
