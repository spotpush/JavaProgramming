/*
Obtain file information like name, path, length etc
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.filehandling;

/* Imports */
import java.io.File;

public class GetFileInfor 
{
    public static void main(String[] args) 
    {
        File myFileObj = new File("D:\\Business\\Spotpush LTD\\Development\\Java\\javaprograms\\NetBeans\\FileHandling\\filename.txt");
        if (myFileObj.exists())
        {
            System.out.println("File Name: "+myFileObj.getName());
            System.out.println("File Parent: "+myFileObj.getParent());
            System.out.println("Absolute Path: "+myFileObj.getPath());
            System.out.println("Writable: "+myFileObj.canWrite());
            System.out.println("Readable: "+myFileObj.canRead());
            System.out.println("File size in bytes: "+myFileObj.length());
        }
        else
        {
            System.out.println("File does not exist.");
        }
    }
}
