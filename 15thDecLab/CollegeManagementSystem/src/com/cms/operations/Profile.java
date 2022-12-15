package com.cms.operations;

import com.cms.db.DbConnection;
import com.cms.navigation.LoggedInMenu;
import java.sql.ResultSet;
import java.sql.Statement;

public class Profile {
    public static void profile() throws Exception {
        // calling getProfileInfo method
        getProfile();
    }
    private static void getProfile() throws Exception {
        ResultSet rs;
        try (Statement st = DbConnection.connect().createStatement()) {
            rs = st.executeQuery("select id,name,phone,dept from students where id="+StudentInfo.getStudentId());
        }
        if (rs.next()) {
            System.out.println("Name: "+rs.getString("name"));
            System.out.println("Phone Number: "+rs.getLong("phone"));
            System.out.println("Registration Number: "+rs.getInt("id"));
            System.out.println("Department: "+rs.getString("dept"));

            // Going back
            LoggedInMenu.loggedInmenu();
        }
        else {
            System.out.println("Oh No! Some unexpected error occurred :(");
            System.out.println("We're Sorry :0");
            LoggedInMenu.loggedInmenu();
        }
    }
}
