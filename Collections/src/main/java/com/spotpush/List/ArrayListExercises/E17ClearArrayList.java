/*
Clear ArrayList
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;

import java.util.ArrayList;
import java.util.List;

/* Imports */


public class E17ClearArrayList 
{
    public static void main(String[] args) 
    {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println("ArrayList before clear(): "+al);
        //clears the array a1 of all elements
        //clear is much faster than removeAll
        al.clear();
        System.out.println("ArrayList after clear(): "+al);
        
        List<Integer> al2 = new ArrayList<>();
        al2.add(6);
        al2.add(7);
        al2.add(8);
        al2.add(9);
        al2.add(10);
        System.out.println("ArrayList before removeAll(): "+al2);
        //remove all elements from the al2 list 
        al2.removeAll(al2);
        //as an alternative
        //remove fro mthe 1stList all those elements that appear in the 2ndList
        //leaving the 2ndList unchanged
        //1stList.removeAll(2ndList);
        
        System.out.println("ArrayList after removeAll(): "+al2);
    }
}
