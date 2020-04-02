/*
Navigating the ResultSet
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.jdbc;
/* Imports */

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ResultSetNavigation 
{
    public static void main(String[] args) 
    {
        Connection conn = null;
        Statement stmt = null;
        CallableStatement cstmt = null;
        try (InputStream input = new FileInputStream("C:\\gitrepo\\JavaProgramming\\JDBC\\src\\main\\java\\resources/db.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            String url = prop.getProperty("MYSQL_DB_URL");
            String user = prop.getProperty("MYSQL_USER");
            String password = prop.getProperty("MYSQL_PASSWORD");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to Database...");
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("Creating a Statement...");
            stmt = conn.createStatement();
            //String sql;
            //sql = "SELECT * FROM actor WHERE last_name like 'G%'";
            
            //sql query calles a stored procedure on the database
            String callableSQL = "{call actor()}";
            cstmt = conn.prepareCall(callableSQL, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            
            //ResultSet rs = stmt.executeQuery(sql);
            //ResultSet rs = stmt.executeQuery(callableSQL);
            ResultSet rs = cstmt.executeQuery(callableSQL);
            
            //ResultSet Navigation
            
            System.out.println("Moving cursor to the First Record");
            //rs.last();
            rs.first(); //replace rs.last with this
            //rs.next(); //replace rs.last with this
            //rs.getRow(); //replace rs.last with this
            int actor_id = rs.getInt("actor_id");
            String first_name = rs.getString("first_name");
            String last_name = rs.getString("last_name");
            String last_update = rs.getString("last_update");
                
            System.out.print("Actor ID: "+actor_id);
            System.out.print(", First Name: "+first_name);
            System.out.print(", Last Name: "+last_name);
            System.out.println(", Last Update: "+last_update);
            System.out.println("Displaying First Record");
            
            /*
            while(rs.next()) { //next row rs.next
                int actor_id1 = rs.getInt("actor_id");
                String first_name1 = rs.getString("first_name");
                String last_name1 = rs.getString("last_name");
                String last_update1 = rs.getString("last_update");
                
                System.out.print("Actor ID: "+actor_id1);
                System.out.print(", First Name: "+first_name1);
                System.out.print(", Last Name: "+last_name1);
                System.out.println(", Last Update: "+last_update1);
            } */
            rs.close();
            stmt.close();
            cstmt.close();
            conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
            try {
                if (stmt!=null)
                    stmt.close();
            }catch(SQLException se2) {
            }
            try {
                if (cstmt!=null)
                    cstmt.close();
            }catch(SQLException se3) {
            }
            try {
                if (conn!=null)
                    conn.close();
            }catch (SQLException se){
                se.printStackTrace();
                     
            }
        }
        System.out.println("Finihsed...Good bye!");
    }
    
}
