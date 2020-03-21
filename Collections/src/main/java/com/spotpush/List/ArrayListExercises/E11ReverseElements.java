/*
Write a Java program to reverse elements in a array list.
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Imports */


public class E11ReverseElements 
{
    public static void main(String[] args) 
    {
        List<String> al = new ArrayList<>();
        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");
        al.add("5");
        al.add("6");
        al.add("7");
        System.out.println("Before reverse: "+al);
        Collections.reverse(al);
        System.out.println("After reverse: "+al);
    }
}
