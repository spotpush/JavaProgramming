/*
Write to a file
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.filehandling;

/* Imports */
import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFile 
{
    public static void main(String[] args) 
    {
        try
        {
            FileWriter myWrite = new FileWriter("filename.txt");
            myWrite.write("Files in Java might be tricky, but it is fun enough!");
            myWrite.close();
            System.out.println("File successfully updated");
        }
        catch (IOException e)
        {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
