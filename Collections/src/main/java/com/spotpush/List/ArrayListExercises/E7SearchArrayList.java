/*
Write a Java program to search an element in a array list.
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;

/* Imports */
import java.util.List;
import java.util.ArrayList;

public class E7SearchArrayList 
{
    public static void main(String[] args) 
    {
        List<String> al = new ArrayList<>();
        al.add("One");
        al.add("Two");
        al.add("Three");
        al.add("Four");
        al.add("Five");
        al.add("Six");
        al.add("Six");
        
        //boolean true/false
        if(al.contains("Three")){
            System.out.println("Item Found");
        } else {
            System.out.println("Item Not Found");
        }
        
        //This finds the position within the ArrayList of the first occurence 
        int firstIndex = al.indexOf("Six");
        System.out.println(+firstIndex); //returns 5
                       
        //This finds the position within the ArrayList of the last occurence
        int lastIndex = al.lastIndexOf("Six");
        System.out.println(+lastIndex); //returns 6
    }
}
