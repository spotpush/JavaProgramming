/*

*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.collection.set.abstractset.HashSet;
/* Imports */
import java.util.HashSet;
import java.util.Iterator;

public class SetHash 
{
    public static void main(String[] args) 
    {
        HashSet<String> hs = new HashSet<>();
        
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
        
        
    }
}
