/*
List Array
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.collection.list.abstractlist.arraylist;

/* Imports */
import java.util.ArrayList;
import java.util.List;

public class ListArray 
{
    public static void main(String[] args) 
    {
        //declare a new List instace of ArrayList pre java 7
        //spefifinc
        List<String> al7 = new ArrayList<String>();
        al7.add("One");
        al7.add("Two");
        al7.add("Three");
        al7.add("Four");
        System.out.print(al7);
        
        //declare a new List instance of ArrayList post java 7
        //without the need to declare the type parameter on the right
        //hand side
        List<String> al8 = new ArrayList<>();
        al8.add("One");
        al8.add("Two");
        al8.add("Three");
        al8.add("Four");
        System.out.print(al8);
        
        //Since Java 9 you can use List.of on my current version of Java this 
        //doesn't work
        //List<String> al9 = List.of(one, two, three, four);
        
        //Yoiu can define the size of the ArrayList - 1000 if you leave
        //the constructor empty ArrayList<>() then the default size is 10
        List<Integer> ListMaxNumbers = new ArrayList<>(1000);
        
        //to construct a list from a list
        List<String> listfromlist = new ArrayList<>(al8);
        
        
        
    }
}
