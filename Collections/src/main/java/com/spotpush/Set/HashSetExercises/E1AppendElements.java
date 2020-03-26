/*
Write a Java program to append the specified element to the end of a hash set.
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.Set.HashSetExercises;
/* Imports */
import java.util.HashSet;

public class E1AppendElements 
{
    public static void main(String[] args) 
    {
        HashSet<String> hs = new HashSet<>();
        
        //adding elements
        hs.add("Stephen Hardy");
        hs.add("Kate Hardy");
        hs.add("Ana Hardy");
        hs.add("Elizabeth Hardy");
        //notice how the output display is bottom up
        System.out.println("HashSet contents: "+hs);
        
        //append element to the end of a hash set
        
    }
}
