/*
Write a Java program to extract a portion of a array list.
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;

import java.util.ArrayList;
import java.util.List;

/* Imports */


public class E12ExtractPortionArray 
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
        al.add("i");
        al.add("j");
        al.add("k");
        System.out.println("Full list of Array Elements: "+al);
        
        //creat a subList by extracting a portion of an ArrayList
        List<String> subal = al.subList(3,6);
        System.out.println("Sublist: "+subal);
    }
}
