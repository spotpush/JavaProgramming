/*
BatchingStatementObj - running multiple SQL statements in one connection
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.jdbc;
/* Imports */

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BatchingStatementObj 
{
    public static void main(String[] args) 
    {
        Connection conn = null;
        Statement stmt = null;
        try (InputStream input = new FileInputStream("C:\\gitrepo\\JavaProgramming\\JDBC\\src\\main\\java\\resources/db.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            String url = prop.getProperty("MYSQL_DB_URL");
            String user = prop.getProperty("MYSQL_USER");
            String password = prop.getProperty("MYSQL_PASSWORD");
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
            stmt = conn.createStatement(); //step 1 create statement object
            
            conn.setAutoCommit(false); //step 2 setAutoCommit
            
            printRows(stmt);
            
            String sql = "INSERT INTO actor (first_name, last_name) "
                    + "VALUES('Stephen', 'Hardy')"; 
            stmt.addBatch(sql);//step 3 add sql statement to batch 

            sql = "INSERT INTO actor (first_name, last_name) "
                    + "VALUES('Kate', 'Hardy')";
            stmt.addBatch(sql);//step 4 add sql statement to batch
            
            sql = "INSERT INTO actor (first_name, last_name) "
                    + "VALUES('Ana', 'Hardy')";
            stmt.addBatch(sql);//step 5 add sql statement to batch
                        
            sql = "INSERT INTO actor (first_name, last_name) "
                    + "VALUES('Elizabeth', 'Hardy')";
            stmt.addBatch(sql);//step 6 add sql statement to batch
            
            int[] count = stmt.executeBatch();//create an int[] to hold returned values
            
            conn.commit();//explicitly commit statments to apply changes
          
            printRows(stmt);
            
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
                } catch(SQLException se2) {
                }
                try {
                    if (conn!=null)
                        conn.close();
                } catch (SQLException se){
                    se.printStackTrace();
                }
            }
            System.out.println("Finihsed...Good bye!");
    }
    
    public static void printRows(Statement stmt) throws SQLException {
        System.out.println("Displaying available rows...");
        String sql = "SELECT * FROM actor WHERE last_name = 'Hardy'";
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
            int actor_id = rs.getInt("actor_id");
            String first_name = rs.getString("first_name");
            String last_name = rs.getString("last_name");
            String last_update = rs.getString("last_update");
                
            System.out.print("Actor ID: "+actor_id);
            System.out.print(", First Name: "+first_name);
            System.out.print(", Last Name: "+last_name);
            System.out.println(", Last Update: "+last_update);
        }
        System.out.println();
        rs.close();
             
    }//end printRows
    
}//end BatchingStatementObj
