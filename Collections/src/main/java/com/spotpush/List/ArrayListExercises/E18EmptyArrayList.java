/*
Write a Java program to test an array list is empty or not.
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;
/* Imports */

import java.util.ArrayList;
import java.util.List;




public class E18EmptyArrayList 
{
    public static void main(String[] args) 
    {
    List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        boolean empty = al.isEmpty();
        if (empty == true){
         System.out.println("List is empty: ");
        } else {
            System.out.println(al);
        }
    }
}
