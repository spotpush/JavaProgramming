/*
Write a Java program to retrieve an element (at a specified index) from 
a given array list.
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;

/* Imports */
import java.util.List;
import java.util.ArrayList;

public class E4RetrieveElement 
{
    public static void main(String[] args) 
    {
        List<String> al = new ArrayList<>();
        al.add("Stephen");
        al.add("Kate");
        al.add("Ana");
        al.add("Elizabeth");
        
        String element = al.get(1);
        System.out.print(element);
           
        
        
    }
}