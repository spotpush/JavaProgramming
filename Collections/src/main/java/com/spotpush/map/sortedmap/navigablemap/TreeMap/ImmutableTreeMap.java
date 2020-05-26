package com.spotpush.map.sortedmap.navigablemap.TreeMap;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
* This is how you create an immutable TreeMap
* @author Stephen Hardy @ spotpush.com
*/

public class ImmutableTreeMap {

    /**
     * Even though tMap is declared static and final it can still be
     * operated on once it's initialised like ImmutableTreeMap.tMap.put(3,"three");
     * Therefore tMap isn't immutable
     */
    private static final Map tMap;
    static {
        tMap = new TreeMap();
        tMap.put(1,"one");
        tMap.put(2,"two");
    }
    
    /**
     * Adding Collection.unmodifiableMap(tMap) as follows ensures
     * the TreeMap remain immutable after initialisation calling
     * ImmutableTreeMAp.iMap.put(3,"three"); reports an 
     * UnsupportedOperationException
     * If you run ImmutableTreeMap.Map 
     */
    private static final Map iMap;
    static {
        Map tMap = new TreeMap();
        tMap.put(1,"one");
        tMap.put(2,"two");
        iMap = Collections.unmodifiableMap(tMap);
    }
   
    public static void main(String[] args) {
    
        tMap.put(3,"three"); //Adds entry to tMap
        System.out.println(tMap);
        
        iMap.put(3,"three"); //throws an exception on iMap
        System.out.println(iMap);
        
    }
}
