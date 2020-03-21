/*
13. Write a Java program to find duplicate values of an array of string values.
*/
/**
  * @author Stephen Hardy
 */
package com.spotpush.arrays;

import java.util.Arrays;

public class Exercise13 
{
    public static void main(String[] args) 
    {
        String[] array = {"a","b","c","d","d"};
        System.out.println("Contents of 'array' "+Arrays.toString(array));
       
        for(int i= 0;i<array.length-1;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i] == array[j])
                {
                    System.out.println("Duplicate Element: "+array[j]);
                }
            }
        }
    }
    
}
