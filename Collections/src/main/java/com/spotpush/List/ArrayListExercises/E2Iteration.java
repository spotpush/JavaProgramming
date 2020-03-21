/*
Write a Java program to iterate through all elements in a array list
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.List.ArrayListExercises;

/* Imports */
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class E2Iteration 
{
    public static void main(String[] args) 
    {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(10);
        numberList.add(100);
        numberList.add(1000);
        numberList.add(10000);
        numberList.add(100000);
        numberList.add(1000000);
        
        //there are 4 ways to move through each element of an array
                
        //1 The classic for loop
        for(int i=0;i<numberList.size();i++){
            int nL = numberList.get(i);
            System.out.println(nL);
        }
                
        //2 The Iterator
        Iterator<Integer> iterator = numberList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        //3 The enhanced for Loop
        for (Integer listElement : numberList){
            System.out.println(listElement);
        }

        //4 forEach Method with Lambda Expression 
        numberList.forEach(s -> System.out.println(s));
        
    }
}
