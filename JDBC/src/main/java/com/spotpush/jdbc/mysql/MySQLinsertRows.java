/*
Inter rows into a database table
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.jdbc.mysql;

/* Imports */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLinsertRows 
{
    static final String MYSQL_JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String MYSQL_DB_URL = "jdbc:mysql://localhost/university";
    
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
            String sql = "INSERT INTO students (first_name,last_name,dob,gender)" +
                    "VALUES('Stephen', 'Hardy', '1978/07/03', 'Male')";
            stmt.executeUpdate(sql);
            
            sql = "INSERT INTO STUDENTS (first_name,last_name,dob,gender)" +
                    "VALUES('Kate', 'Hardy', '1979/02/26', 'Female')";
            stmt.executeUpdate(sql);
            
            sql = "INSERT INTO STUDENTS (first_name,last_name,dob,gender)" +
                    "VALUES('Ana', 'Hardy', '2014/05/04', 'Female')";
            stmt.executeUpdate(sql);
            
            sql = "INSERT INTO STUDENTS (first_name,last_name,dob,gender)" +
                    "VALUES('Elizabeth', 'Hardy', '2017/04/26', 'Female')";
            stmt.executeUpdate(sql);
            
            System.out.print("Update successful...");
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
        
               
        }
    }
}