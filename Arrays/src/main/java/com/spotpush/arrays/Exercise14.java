/*
 14. Write a Java program to find the common elements between two arrays (string values).
 */
package com.spotpush.arrays;

import java.util.Arrays;

/**
 *
 * @author Stephen Hardy
 */
public class Exercise14 
{

    public static void main(String[] args) 
    {
        String[] array1 = {"Stephen", "Ana", "Elizabeth", "Katie"};
        String[] array2 = {"Ana", "Elizabeth","Paul", "Katie"};
        
        System.out.println("Current contents of 'array1': "+Arrays.toString(array1));
        System.out.println("Current contents of 'array2': "+Arrays.toString(array2));
        
        for (int i=0;i<array1.length;i++)
        {
            for (int j=0;j<array2.length;j++)
            {
                if(array1[i] == array2[j])
                {
                    System.out.println("Matching Element: "+array2[j]);
                }
            }
        }
    }
    
}
