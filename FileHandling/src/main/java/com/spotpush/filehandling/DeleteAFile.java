/*
Delete a file
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.filehandling;

/* Imports */
import java.io.File;

public class DeleteAFile 
{
    public static void main(String[] args) 
    {
        File myFileObj = new File("D:\\Business\\Spotpush LTD\\Development\\Java\\javaprograms\\NetBeans\\FileHandling\\filename.txt");
        if (myFileObj.delete())
        {
            System.out.println(myFileObj.getName()+" deleted successfullly.");
        }    
        else
        {
            System.out.println(myFileObj.getName()+" failed to delete.");
        }
        
    }
}
