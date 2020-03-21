/*
Write a Java program to insert an element into the array list at the 
first position.
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;

/* Imports */
import java.util.List;
import java.util.ArrayList;

public class E3InsertElement 
{
    public static void main(String[] args) 
    {
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");
        stringList.add("five");
        
            for(String element : stringList){
                System.out.println(element);
            }
        System.out.println();
        
        //inserts elements at specified positions
        stringList.add(0,"Ana");
        stringList.add(3,"Elizabeth");
        
            for(String element : stringList){
                System.out.println(element);
            }  
        
        
    }
}
