/*
 Write a Java program to clone an array list to another array list.
Shallow Copy
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;

/* Imports */
import java.util.ArrayList;
import java.util.List;

//public class E16CloneArray implements Cloneable 
public class E16CloneArray
{
    public static void main(String[] args) 
    {
        ArrayList<String> al = new ArrayList<>();
        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");
        al.add("5");
        System.out.println("Original List: "+al);
        
        //Shallow Copy
        List<String> cloneList = (ArrayList<String>) al.clone();
        System.out.println("Cloned List: "+cloneList);
        
    }
}
