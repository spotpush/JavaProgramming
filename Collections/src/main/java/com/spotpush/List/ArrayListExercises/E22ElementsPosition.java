/*
Write a Java program to print all the elements of a ArrayList using the 
position of the elements.
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;
/* Imports */
import java.util.ArrayList;

public class E22ElementsPosition 
{
    public static void main(String[] args) 
    {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        al.add("e");
        System.out.println("Position and Elements: ");
        int numberElements = al.size();
        for(int index = 0;index < numberElements;index++){
            System.out.println(al.get(index));
        }
    }
}
