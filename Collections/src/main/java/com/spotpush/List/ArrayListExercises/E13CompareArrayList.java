/*
Write a Java program to compare two array lists.
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;

/* Imports */
import java.util.ArrayList;
import java.util.List;

public class E13CompareArrayList 
{
    public static void main(String[] args) 
    {
    
        List<String> listOne = new ArrayList<>();
        List<String> listTwo = new ArrayList<>();
        listOne.add("1");
        listOne.add("2");
        listOne.add("3");
        listTwo.add("1");
        listTwo.add("2");
        listTwo.add("3");
        System.out.println(listOne.equals(listTwo)); //returns true
        boolean listCompare = listOne.equals(listTwo); //return true
        System.out.print(listCompare); //no + required for boolean operator
    }
}
