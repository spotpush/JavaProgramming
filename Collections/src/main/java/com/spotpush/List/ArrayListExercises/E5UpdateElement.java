/*
Write a Java program to update specific array element by given element
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;

/* Imports */
import java.util.List;
import java.util.ArrayList;

public class E5UpdateElement 
{
    public static void main(String[] args) 
    {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println("Before Insert");
        System.out.println(al);
        al.set(2,200);
        al.set(3,1000);
        System.out.println("After Insert");
        System.out.println(al);
        
    }
}
