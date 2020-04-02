/*

*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/* Imports */


public class MySQLdbConnection 
{
    public static void main(String[] args) 
    {
        Connection conn = null;
        Statement stmt = null;
        try (InputStream input = new FileInputStream("C:\\gitrepo\\JavaProgramming\\JDBC\\src\\main\\java\\resources/db.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            String url = prop.getProperty("POSTGRE_DB_URL");
            String user = prop.getProperty("POSTGRE_USER");
            String password = prop.getProperty("POSTGRE_PASSWORD");
            Class.forName("org.postgresql.Driver");
            System.out.println("Connecting to Database...");
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("Creating a Statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM actor WHERE last_name like 'W%'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                int actor_id = rs.getInt("actor_id");
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                String last_update = rs.getString("last_update");
                
                System.out.print("Actor ID: "+actor_id);
                System.out.print(", First Name: "+first_name);
                System.out.print(", Last Name: "+last_name);
                System.out.println(", Last Update: "+last_update);
            }
            rs.close();
            stmt.close();
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
                if (conn!=null)
                    conn.close();
            }catch (SQLException se){
                se.printStackTrace();
                     
            }
        }
        System.out.println("Finihsed...Good bye!");
    }
    
}
