package com.cms.validation;

// Importing necessary packages
import com.cms.db.DbConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchHash {

    // Method to fetch password hash
    public static String fetchPasswordHash(int id) throws Exception {

        // Creating statement object and executing query
        Statement statement = DbConnection.connect().createStatement();
        ResultSet rs = statement.executeQuery("select passwordhash from students where id="+id);
        rs.next();

        // Returning result
        return rs.getString("passwordhash");
    }

    // Method to fetch password hash
    public static String fetchRecoveryKeyHash(int id) throws Exception {

        // Creating statement object and executing query
        Statement statement = DbConnection.connect().createStatement();
        ResultSet rs = statement.executeQuery("select recoverykeyhash from students where id="+id);
        rs.next();

        // Returning result
        return rs.getString("recoverykeyhash");
    }

    // Method to fetch password hash
    public static String fetchPinHash(int id) throws Exception {

        // Creating statement object and executing query
        Statement statement = DbConnection.connect().createStatement();
        ResultSet rs = statement.executeQuery("select pinhash from students where id="+id);
        rs.next();

        // Returning result
        return rs.getString("pinhash");

    }

}