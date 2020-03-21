/*
Write a Java program to sort a given array list.
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Imports */

public class E8SortArrayList 
{
    public static void main(String[] args) 
    {
        List<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(6);
        al.add(28);
        al.add(3);
        al.add(18);
        al.add(9);
        al.add(7);
        System.out.println("Unsorted List: "+al);
        Collections.sort(al);
        System.out.println("Sorted List: "+al);
        
        //the reverse() method just reverses a list it doesn't sort it
        Collections.reverse(al);
        System.out.println("Reverse Order: "+al);
        
        //Sort fist then reverse order
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("Sort and Reverse Order: "+al);
        
        
    
    }
}
