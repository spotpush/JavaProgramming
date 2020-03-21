/*
Write a Java program to replace the second element of a ArrayList 
with the specified element
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;
/* Imports */

import java.util.ArrayList;

public class E21ReplaceElementWith 
{
    public static void main(String[] args) 
    {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        al.add("e");
        System.out.println("Current ArrayList: "+al);
        al.set(1, "Test");
        System.out.println("ArrayList after replacement: "+al);
    }
}
