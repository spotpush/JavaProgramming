/*
16. Write a Java program to remove duplicate elements from an array.
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.arrays;

import java.util.Arrays;
//import java.util.ArrayList;
import java.util.List;

public class Exercise16 
{
    public static void main(String[] args) 
    {
        String[] array = {"1","2","3","4","4","5","6","7","7","8","9","10","10"};
        List<String> listArray = Arrays.asList(array);
        
        System.out.println("Array contents: "+Arrays.toString(array));
        System.out.println("List contents: "+listArray);
        
        System.out.println("After removing duplicates: "+listArray);
        
        for(int i=0;i<=listArray.size();i++)
        {
            for(int j=0;i<listArray.size();j++)
            {
                if(listArray.get(i) == listArray.get(j))
                {
                    //System.out.println("Duplicate Item: "+listArray.get(j));
                    listArray.remove(j);
                }           
            }
        }
        
    }
    
      
}
