/*
Create a File
*/

package com.spotpush.filehandling;

/** @author Stephen Hardy @ spotpush.com */

import java.io.File;
import java.io.IOException;

public class CreateAFile 
{
    public static void main(String[] args) 
    {
        try
        {    
            File myFile = new File("filename.txt");
            if(myFile.createNewFile())
            {
                System.out.println("File Created: "+myFile.getName());
            }
            else
            {
                System.out.println("File already exists.");
            }
        } 
        catch (IOException e) 
        {
            System.out.println("Anb error occurred.");
            e.printStackTrace();
        }
    }
}
