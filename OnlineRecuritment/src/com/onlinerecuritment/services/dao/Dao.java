package com.onlinerecuritment.services.dao;
import java.sql.*;

public class Dao {
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";    
    private static String driverName = "oracle.jdbc.driver.OracleDriver";   
    private static String username ="hr";   
    private static String password ="abc";
    private static Connection con;
    

    public static Connection dbconnect() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            
            System.out.println("Driver not found."); 
        }
        return con;
    }
}