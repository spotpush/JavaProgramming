package com.spotpush.map.sortedmap.navigablemap.TreeMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

/**
* Comparator() method allows you to specify a custom ordering of a Map
* by defining a custom comparator you override the default natural ordering
* of a Map such as a TreeMap
* Comparators should only be for keys not the whole entry.  It sorts entries
* based on keys
* @author Stephen Hardy @ spotpush.com
*/

public class ComparatorTreeMap {

    public static void main(String[] args) {
    
        /**
         * This orders reversMap in reverse Order
         */
        TreeMap<Integer,String> reverseMap = 
                new TreeMap<>(Collections.reverseOrder());
        
        
        /**
         * This ignores case sensitivity 
         */
        TreeMap<String, String> caseMap = 
                new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        
        /**
         * Long version of case sensitivity with anonymous classes
         */
        TreeMap<String,String> shortFormCaseMap = 
                new TreeMap<>(new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        return s1.compareToIgnoreCase(s2);
                    }
                });
    }
}
