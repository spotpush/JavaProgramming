/*
Write a Java program of swap two elements in an array list.
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;

/* Imports */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class E14SwapArrayElements 
{
    public static void main(String[] args) 
    {
        List<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        al.add("e");
        al.add("f");
        al.add("g");
        al.add("h");
        System.out.println("Before Swap: "+al);
        Collections.swap(al,3,7);
        System.out.println("After Swap: "+al); //swaps d & h
        
        
                
    }
}
