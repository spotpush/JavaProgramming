/*
Write a Java program to copy one array list into another.
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Imports */


public class E9CopyArray 
{
    public static void main(String[] args) 
    {
        List<Integer> sourceList = new ArrayList<>();
        List<Integer> destinationList = new ArrayList<>(20);
        sourceList.add(2);
        sourceList.add(6);
        sourceList.add(28);
        sourceList.add(3);
        sourceList.add(18);
        sourceList.add(9);
        sourceList.add(7);
        System.out.println("sourceList before sort and copy: "+sourceList);
        Collections.sort(sourceList);
        System.out.println("after sort: "+sourceList);
        
        //collections.copy olny work when copying from 1 array to another 
        //of the same size and definition.  For all the sourceList.add lines 
        //above you need destinationList.add lines to match. The collection.copy 
        //will overwright them.  When the ArrayList is empty then you need to 
        //use a more complex approach ArrayList clone()
        Collections.copy(destinationList,sourceList);
        System.out.println("After sort and Copy to destinationList: "+destinationList);
        
    }
}
