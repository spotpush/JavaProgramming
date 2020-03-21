/*
Test how array.length works
 */
package com.spotpush.arrays;

/** @author Stephen Hardy @ spotpush.com */

public class TestArrayLength 
{
    public static void main(String[] args) 
    {
        int[] array = {1,2,3,4,5,6};
        int LastElement = array.length -1;
        System.out.println("Last value in array: "+(array[LastElement]));
        
        //this print 1 to 5
        for (int i = 0; i<array.length-1;i++)
        {
            System.out.println("Array Elements: "+array[i]);
            
        }
        
        //this print 1-6
        for (int i = 0; i<array.length;i++)
        {
            System.out.println("Array Elements: "+array[i]);
            
        }
    }
    
}
