package com.wisitor.helper;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    private static Connection con;
    //get connection method
    public static Connection getConnection() {
        try {
            if(con == null) {
                // Load the MySQL driver
                Class.forName("com.mysql.jdbc.Driver");

                // Create connection
                con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/wisitor",
                    "root",
                    "2003"
                );

                System.out.println("Connection successful!"); // Add this for debugging
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
            e.printStackTrace();
        }
        return con;
    }
}