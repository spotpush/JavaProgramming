/*
provides a connection to the Oracle db
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.jdbc;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/* Imports */


public class OracledbConnection 
{
    public static void main(String[] args) 
    {
        Connection conn = null;
        Statement stmt = null; //SQL statements for execution at runtime
        try (InputStream input = new FileInputStream("C:\\gitrepo\\JavaProgramming\\JDBC\\src\\main\\java\\resources/db.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            String driver = prop.getProperty("ORACLE_JDBC_DRIVER");
            String url = prop.getProperty("ORACLE_DB_URL");
            //String user = prop.getProperty("ORACLE_USER"); //details contained in the url
            //String password = prop.getProperty("ORACLE_PASSWORD"); //details contained in the url
            System.out.println("Register Database Driver...");
            Class.forName(driver); //slower
            //Class.forName("oracle.jdbc.OracleDriver"); //faster 
            System.out.println("Connect to Database...");
            //conn = DriverManager.getConnection(url,user,password);
            conn = DriverManager.getConnection(url);
            System.out.println("Create SQL Statement...");
            stmt = conn.createStatement();
            //String sql = "SELECT * FROM countries";
            //ResultSet rs = stmt.executeQuery(sql);
            ResultSet rs = stmt.executeQuery("SELECT * FROM countries");
            while(rs.next()) {
                String country_id = rs.getString("COUNTRY_ID");
                String country_name = rs.getString("COUNTRY_NAME");
                String region_id = rs.getString("REGION_ID");
                
                System.out.print("Country ID: "+country_id);
                System.out.print(", Country Name: "+country_name);
                System.out.println(", Region ID: "+region_id);
                
            }
            rs.close();
            System.out.println("Close ResultSet");
            stmt.close();
            System.out.println("Close Statement");
            conn.close();
            System.out.println("Close Connection");
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
