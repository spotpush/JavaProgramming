/*
Write a Java program to trim the capacity of an array list the current list size.
speficy a list size in the array declaration
then depending on the number of elements remove any unused capacity
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;

/* Imports */
import java.util.ArrayList;

public class E19TrimArrayCapacity 
{
    public static void main(String[] args) 
    {
    //trimToSize only works with ArrayList (method) variable declaration
    //if you specificy an initial Capacity (10 elements) but only store 5 
    //then trimToSize will trim the array size from 10 to 5
    ArrayList<Integer> al = new ArrayList<>(10);
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    al.add(5);
    System.out.println("Current List: "+al);
    al.trimToSize();
    System.out.println("Current List: "+al);
    
    }
}
