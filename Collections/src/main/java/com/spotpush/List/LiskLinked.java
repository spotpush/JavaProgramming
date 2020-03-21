/*
Linked List
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List;

/* Imports */
import java.util.List;
import java.util.LinkedList;

public class LiskLinked 
{
    public static void main(String[] args) 
    {
        //declare new list instance of LinkedList
        List<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
    }
}
