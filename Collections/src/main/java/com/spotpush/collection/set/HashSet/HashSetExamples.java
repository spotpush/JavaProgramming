package com.spotpush.collection.set.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Default initial capacity if a HashSet is 16
 * if you know the HasSet will need to hold more items then set it's capacity
 * at creation
 * @author Stephen Hardy @ spotpush.com 
 */
 
public class HashSetExamples 
{
    
    //create a HashSet with 1000 elements
    static HashSet<Integer> hashInt = new HashSet<>(1000);
    
    
    static HashSet<String> hs = new HashSet<>();
    static void hsElments() {
        hs.add("Stephen");
        hs.add("Kate");
        hs.add("Ana");
        hs.add("Elizabeth");
    }
    
    static void creatSetFromCollection() {
        List<Integer> listNumbers = Arrays.asList(3,9,1,4,7,2,5,3,8,9,1,3,8,6);
        System.out.println("listNumbers: "+listNumbers);
        Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
        System.out.println("By passing listNumbers into a HashSet<>(listNumbers)");
        System.out.println("you get an ordered list a duplicates removed");
        System.out.println(uniqueNumbers);
    } 
    
    static void differentSetImplementations() {
        
        /**
         * Reference Type Set<String>
         * Concrete Implementation HashSet, LinkedHashSet, TreeSet  
         */
        Set<String> setStr = new HashSet<>();
        Set<Integer> setInt = new LinkedHashSet<>();
        Set<Character> setChar = new TreeSet<>(); 
    }
    
    
    public static void main(String[] args) 
    {
                
        //adding elements
        hs.add("Stephen");
        hs.add("Kate");
        hs.add("Ana");
        hs.add("Elizabeth");
        //notice how the output display is bottom up
        System.out.println("HashSet contents: "+hs);
        
        //removing elements
        hs.remove("Stephen");
        System.out.println("After removing 'Stephen': "+hs);
        
        //iterate over a HashSet
        //declare an iterator
        Iterator<String> i = hs.iterator();
        System.out.println("Iterate through remaining HashSet elements: ");
        while(i.hasNext())
            System.out.println(i.next());
        
        //size of HashSet
        int s = hs.size();
        System.out.println("HashSet Size: "+s);
        
        //is the hashset empty False
        System.out.println("Is the HashSet empty: "+hs.isEmpty());
        //Empty hashset
        hs.clear();
        //is the hashset empty True
        System.out.println("Is the HashSet empty: "+hs.isEmpty());
        
        //add elements back into HashSet
        hs.add("Stephen");
        hs.add("Kate");
        hs.add("Ana");
        hs.add("Elizabeth");
        
        
        
        //create a HashSet from an Ordered HAsh SEt6
        creatSetFromCollection();
    }
}
