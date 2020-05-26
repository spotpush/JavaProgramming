package com.spotpush.collection.set.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
* Set Interface
* @author Stephen Hardy @ spotpush.com
*/

public class SetInterface {

    static Set<String> names = new HashSet<>();
    
    static void namesPopulate() {
        names.add("Stephen");
        names.add("Katie");
        names.add("Ana");
        names.add("Elizabeth");
    }
    
    static void setImplementations() {
        
        /**
         * Interface type Set<> as the reference type
         * Concrete Implementation HashSet, LinkedHashSet, TreeSet
         * 
         * Each implementation below has been upcast to Set<>  By using the 
         * interface if you decide to change the implementation all you need 
         * to do is change the implementation at the point of creation
         */
        
        Set<Integer> setInt = new HashSet<>();
        Set<String> setStr = new LinkedHashSet<>();
        Set<Character> setChar = new TreeSet<>();
    }
    
       
    
    public static void main(String[] args) {
    
        
    }
}
