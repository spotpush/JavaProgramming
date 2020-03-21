/*
Write a Java program to remove the third element from a array list. 
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;

/* Imports */
import java.util.List;
import java.util.ArrayList;

public class E6RemoveElement 
{
    public static void main(String[] args) 
    {
        List<String> al = new ArrayList<>();
        al.add("Manchester");
        al.add("London");
        al.add("New York");
        al.add("Hong Kong");
        System.out.println("Before Removal "+al);
        //Removal uses the equals() method so make sure object matches are equal
        //it only removes the first occurrence of a specified element
        //It retuns true if found fale if not
        if(al.remove("Hong Kong")){
            System.out.println("Removed");
        } else {
            System.out.println("Element Not Found");
        }
        
        al.remove(2);
        System.out.println("After removal "+al);
        
        al.clear();
        System.out.println("After clear... ");
    }
}
