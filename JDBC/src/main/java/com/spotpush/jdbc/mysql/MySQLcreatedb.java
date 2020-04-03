/*
Creat a new data base in MYSQL
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.jdbc.mysql;

/* Imports */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLcreatedb 
{
    static final String MYSQL_JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String MYSQL_DB_URL = "jdbc:mysql://localhost/";
    
    static final String MYSQL_DB_USERNAME = "javadev";
    static final String MYSQL_DB_PASSWORD = "Javadev";
    
    public static void main(String[] args) 
    {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(MYSQL_DB_URL,MYSQL_DB_USERNAME,
                    MYSQL_DB_PASSWORD);
            stmt = conn.createStatement();
            String sql = "CREATE DATABASE UNIVERSITY";
            stmt.executeUpdate(sql);
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
                
            } try {
                    if(conn!=null)
                        conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }        
        System.out.println("Database created successfully...");
               
        }
    }
}
