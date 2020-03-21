/*
Write a Java program to join two array lists
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Imports */


public class E15JoinArrayLists 
{
    public static void main(String[] args) 
    {
        List<String> arrayListOne = new ArrayList<>();
        List<String> arrayListTwo = new ArrayList<>();
        arrayListOne.add("aa");
        arrayListOne.add("bb");
        arrayListOne.add("cc");
        arrayListOne.add("dd");
        arrayListTwo.add("ee");
        arrayListTwo.add("ff");
        arrayListTwo.add("gg");
        arrayListTwo.add("hh");
        System.out.println("arrayListOne before join: "+arrayListOne);
        System.out.println("arrayListTwo before join: "+arrayListTwo);
        
        //To concatenate 2 ArrayLists you make a new one and allAll()
        List<String> mergeLists = new ArrayList<>();
        mergeLists.addAll(arrayListOne);
        mergeLists.addAll(arrayListTwo);
        System.out.println(mergeLists);
        
        
        
    }
}
