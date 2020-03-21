/*
Write a Java program to create a new array list, add some colors (string) 
and print out the collection.
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;

/* Imports */
import java.util.List;
import java.util.ArrayList;

public class E1PrintArray 
{
    public static void main(String[] args) 
    {
        //create an array instance
        List<String> colorList = new ArrayList<>();
        colorList.add("Gold");
        colorList.add("Silver");
        colorList.add("Bronze");
        System.out.println(colorList);
        
    }
}
