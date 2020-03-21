/*
15. Write a Java program to find the common elements between two arrays of integers.
*/
package com.spotpush.arrays;

/** @author Stephen Hardy @ spotpush.com */

import java.util.Arrays;

public class Exercise15 
{
    public static void main(String[] args) 
    {
        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = {2,4,6,8};
            
        System.out.println("Array 1 contents: "+Arrays.toString(array1));
        System.out.println("Array 2 contents: "+Arrays.toString(array2));
    
        for (int i=0;i< array1.length;i++)
        {
            for (int j=0;j<array2.length;j++)
            {
                if (array1[i] == array2[j])
                {
                    System.out.println("Matching Element: "+array2[j]);
                }
            }
        }
    }
}
