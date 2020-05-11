/**
Exploring the use of linked lists
* 
*/
/** @author Stephen Hardy @ spotpush.com  */
package com.spotpush.LinkedList;

/*Imports*/
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExercises 
{
    public static void main(String[] args) 
    {
        LinkedList<String> lL = new LinkedList<String>();
        
        lL.add("A");
        lL.add("B");
        lL.add("C");
        System.out.println(lL);
        
        /**
         * 1 - Write a Java program to append the specified element to the end 
         */
        lL.add("F");
        System.out.println(lL);
        
        /**
         * 2 - Write a Java program to iterate through all elements in a linked list.
         * 
         * A - Classic For loop
         */
        System.out.println("Classic For Loop");
        for (int i=0;i<=lL.size()-1;i++){//add -1 avoids out of bounds exception
            String lList = lL.get(i);
            System.out.println(lList);
        }
        /**
         * B - enhanced for loop
         */
        System.out.println("Enhanced For Loop");
        for (String lList : lL){
            System.out.println(lList);
        }
        /**
         * C - Iterator Method
         */    
        System.out.println("ListIterator");
        ListIterator iterator = lL.listIterator();//listIterator of type list
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
            
            //D - forEach lambda expression
            System.out.println("forEach lanbda expression");
            lL.forEach(element -> System.out.println(element));
        
        //3 - Write a Java program to iterate through all elements in a linked list starting at the specified position.
            System.out.println("Print LinkedList contents from position 2 (3)");
            System.out.println("using a classic for loop");
            for(int i=2;i<=lL.size()-1;i++){
                System.out.println(lL.get(i));
            }
            System.out.println("Using an iterator");
            ListIterator pos = lL.listIterator(1); //sets pos to position 1
            while (pos.hasNext()) { //print from position 2
                System.out.println(pos.next());
            }
            
        //4 - Write a Java program to iterate a linked list in reverse order.
            System.out.println("Reverse order classic for-loop");
            //reverse for-loop
            for(int i=lL.size()-1;i>=0;i--){
                System.out.println(lL.get(i));
            }
            
            System.out.println("Reverse order decendingIterator()");
            Iterator itor = lL.descendingIterator();//stores a reverse copy of lL in itor
            while (itor.hasNext()) {//prints each element forward
                System.out.println(itor.next());
            }
            
        //5 - Write a Java program to insert the specified element at the specified position in the linked list.
            System.out.println("Add DD into the 3rd index");
            lL.add(1,"DD"); //1 specifies the location preceding addition or "DD" 
            System.out.println(lL);
        
        //6 - Write a Java program to insert elements into the linked list at the first and last position.
            System.out.println("Add element in the 'First' and 'Last' positions");
            lL.addFirst("First");
            lL.addLast("Last");
            System.out.println(lL);
            
            lL.offerFirst("offerFirst");
            lL.offerLast("offerLast");
            System.out.println(lL);
            
        /**
         * Write a Java program to display the elements and their positions 
         * in a linked list.
         */    
        System.out.println("Display LinkedList Index pointer and Element");
        for (int p=0;p<lL.size();p++) {
            System.out.println("Element Index "+p+" : "+lL.get(p));
        }     
    }
}