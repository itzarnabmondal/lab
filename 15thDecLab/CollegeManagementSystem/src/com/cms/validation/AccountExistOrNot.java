package com.cms.validation;

// Importing necessary packages
import com.cms.db.DbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccountExistOrNot {

    // Method to check account exist or not
    public static boolean check(int id, long phoneNo) throws Exception {

        // Creating prepared statement and executing query
        PreparedStatement ps = DbConnection.connect().prepareStatement("""
                select * from students where id=? and phone=?
                """);
        ps.setInt(1, id);
        ps.setLong(2, phoneNo);
        ResultSet resultSet = ps.executeQuery();

        // Returning boolean result
        return resultSet.next();
    }

}
