/*
Write a Java program to increase the size of an array list.
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;

import java.util.ArrayList;

/* Imports */


public class E20IncreaseArraySize 
{
    public static void main(String[] args) 
    {
        //set an initial capacity 10
        ArrayList<String> al = new ArrayList<>(10);
        //increase capacity to 50
        al.ensureCapacity(50);
        System.out.print("Size of Array: "+al.size());
                
    }
}
