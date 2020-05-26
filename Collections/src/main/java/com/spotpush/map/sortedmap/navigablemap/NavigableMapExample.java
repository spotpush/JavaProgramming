package com.spotpush.map.sortedmap.navigablemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
* NavigableMap Interface is a sub interface of Java SortedMap
* NavigableMap has a few extensions to the SortedMap interface
* @author Stephen Hardy @ spotpush.com
*/

public class NavigableMapExample {

    /**
     * Create an instance of a Java NavigableMap implementing class
     * 2 know implementing classes: TreeMap & ConcurrentSkipListMap
     */
    static NavigableMap nMapTreeMap = new TreeMap();
    static NavigableMap nMapConcurrentSkipListMap = new ConcurrentSkipListMap();
    
    static void populateTreeMap() {
        nMapTreeMap.put(1, "One");
        nMapTreeMap.put(2, "Two");
        nMapTreeMap.put(3, "Three");
        nMapTreeMap.put(4, "Four");
        nMapTreeMap.put(5, "Five");
    }
    
    static void descendingKeySet() {
        NavigableSet reverse = nMapTreeMap.descendingKeySet();
        System.out.println("Descending NavigableSet");
        System.out.println(reverse);
    }
    
    static void descendingMap() {
        NavigableMap descending = nMapTreeMap.descendingMap();
        System.out.println("Descending NavigableMap");
        System.out.println(descending);
    }
    
    /**
     * SortedMap.HeadMap(element)
     * NavigableMap.headMap(element,inclusive)
     * Displays elements less than or less than or equal to 
     */
    static void headMap() {
        SortedMap headmap = nMapTreeMap.headMap(4); //Displays 1,2,3
        NavigableMap headmapinclusive = nMapTreeMap.headMap(4,true); //Displays 1,2,3,4
        System.out.println("SortedMap.headMap(element), Display elements < than given element");
        System.out.println(headmap);
        System.out.println("NavigableMap.headMap(element, inclusive), Display elements <= given element");
        System.out.println(headmapinclusive);
    }
    
    static void tailMap() {
        SortedMap tailMap = nMapTreeMap.tailMap(3); //Displays 3,4,5
        System.out.println("tailMap(element), Display elements >= given element");
        System.out.println(tailMap);
    }
    
    static void subMap() {
        SortedMap sortedSubMap = nMapTreeMap.subMap(2, 5); //Displays
        System.out.println("subMap(start,end), Display elements between given elements");
        System.out.println(sortedSubMap);
        NavigableMap navigableSubMap = nMapTreeMap.subMap(1,false,5,false);
        System.out.println("subMap(start,end), Display elements between and including given elements");
        System.out.println(navigableSubMap);
    }
    
    /**
     * ceilingKey() returns the least key which is >= to a given element or null 
     */
    static void ceilingKey() {
        Object ceilingkey1 = nMapTreeMap.ceilingKey(0);//returns 1
        Object ceilingkey2 = nMapTreeMap.ceilingKey(1);//returns 1
        Object ceilingkey3 = nMapTreeMap.ceilingKey(6);//returns null
        Object ceilingkey4 = nMapTreeMap.ceilingKey(5);//returns 5
        System.out.println("ceilingKey() "+ceilingkey1+", "+ceilingkey2+
                ", "+ceilingkey3+", "+ceilingkey4);
    }
    
    /**
     * floorKey() returns the greatest key <= to a given element or null
     */
    static void floorKey() {
        Object floorkey1 = nMapTreeMap.floorKey(0);//returns null
        Object floorkey2 = nMapTreeMap.floorKey(1);//returns 1
        Object floorkey3 = nMapTreeMap.floorKey(6);//returns 5
        Object floorkey4 = nMapTreeMap.floorKey(7);//returns 5
        System.out.println("floorKey() "+floorkey1+", "+floorkey2+", "
            +floorkey3+", "+floorkey4);
    }
    
    /**
     * Returns the key immediately higher than element specified
     * null if element specified is the highest
     */
    static void higherKey() {
        Object higherKey1 = nMapTreeMap.higherKey(5);//returns null 5 is the highest
        Object higherKey2 = nMapTreeMap.higherKey(0);//returns 1
        System.out.println("higherKey() "+higherKey1+", "+higherKey2);
    }
    
    static void lowerKey() {
        Object lowerKey1 = nMapTreeMap.lowerKey(0);//return null
        Object lowerKey2 = nMapTreeMap.lowerKey(6);//return 5
        Object lowerKey3 = nMapTreeMap.lowerKey(7);//return 5
        System.out.println("lowerKey() "+lowerKey1+", "+lowerKey2+", "+lowerKey3);
    }
    
    /**
     * ceilingEntry() uses Map.Entry to locate a keys value according
     * to defined key element and displays key and value
     * Returns the smallest key which is higher than or equal to parameter
     * value passed
     */
    static void ceilingEntry() {
        Map.Entry ceilingEntry1 = nMapTreeMap.ceilingEntry(2);//2,two
        Map.Entry ceilingEntry2 = nMapTreeMap.ceilingEntry(5);//5,five
        Map.Entry ceilingEntry3 = nMapTreeMap.ceilingEntry(0);//1,one
        Map.Entry ceilingEntry4 = nMapTreeMap.ceilingEntry(6);//null
        System.out.println("Map.Entry() ceilingEntry() "+ceilingEntry1+
                ", "+ceilingEntry2+", "+ceilingEntry3+", "+ceilingEntry4);
    }
    
    static void floorEntry() {
        
    }
    
    static void higherEntry() {
        
    }
    
    static void lowerEntry() {
        
    }
    
    static void pollFirstEntry() {
        
    }
    
    static void pollLastEntry() {
        
    }
    
    
    
    public static void main(String[] args) {
    
        System.out.println("Navigable Map Methods: ");
        populateTreeMap();
        descendingKeySet();
        descendingMap();
        headMap();
        tailMap();
        subMap();
        ceilingKey();
        floorKey();
        higherKey();
        lowerKey();
        ceilingEntry();
        floorEntry();
        higherEntry();
        lowerEntry();
        pollFirstEntry();
        pollLastEntry();
    }
}
