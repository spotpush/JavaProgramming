/*
Read a file
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.filehandling;

/* Imports */
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadAFile 
{
    public static void main(String[] args) 
    {
        try
        {
        //this imports an existing file
        //which i know already exists
        File myFile = new File("D:\\Business\\Spotpush LTD\\Development\\Java\\javaprograms\\NetBeans\\FileHandling\\filename.txt");
        //this transferes the file to myScanedFile
        Scanner myScanedFile = new Scanner(myFile);
            while (myScanedFile.hasNextLine()) 
            {
                String FileContent = myScanedFile.nextLine();
                System.out.println(FileContent);
            }
            myScanedFile.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
