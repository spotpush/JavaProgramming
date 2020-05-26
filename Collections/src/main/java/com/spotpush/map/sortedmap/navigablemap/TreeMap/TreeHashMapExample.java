package com.spotpush.map.sortedmap.navigablemap.TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
* Also refereed to as TreeMap
* TreeMap extends AbstractMap
* TreeMap implements NavigableMap which extends SortedMap and Map interfaces
* 
* Null Keys are not allowed throwing NullPointerException
* TreeMap is not synchronised and thus no thread-safe
* TreeMap sorts by natural order of it's keys.  Integers ascending
* strings alphabetical
* You can't sort TreeMaps on values unless you use a SortedSet
* 
* This class explores the TreeMap map for storing data
* @author Stephen Hardy @ spotpush.com
*/

public class TreeHashMapExample {

    /**
     * Create a TreeMap - TreeMap<key,value>
     */
    static TreeMap<Integer,String> tmap = new TreeMap<>();
    static void populateTmap() {
        tmap.put(1,"MCFC");
        tmap.put(20,"MUFC");
        tmap.put(2,"LFC");
        tmap.put(4,"THFC");
        tmap.put(3,"CFC");
        System.out.println(tmap);
    }
    
    static void keySetForEach() {
        System.out.println("Get the TreeMap keySet() and iterate "
                + "with a for-each loop");
        Set<Integer> set = tmap.keySet();
        for (Integer key : set) {
            System.out.println(key+", "+tmap.get(key));
        }
    }
    
    static void keySetForEachKey() {
        System.out.println("Prints/Finds just 'Keys'");
        for(Integer key : tmap.keySet())
            System.out.println(key);
    }
    
    static void keySetForEachValue() {
        System.out.println("Prtins/Finds just 'Values'");
        for(String values : tmap.values())
            System.out.println(values);
    }
    
    static void keySetIterator() {
       System.out.println("Get the TreeMap keySet() and iterate "
               + "using the Iterator Interface");
       Set set = tmap.keySet();
       Iterator<Integer> iterator = set.iterator();
       while(iterator.hasNext()) {
           Integer key = iterator.next();
           System.out.println(key+", "+tmap.get(key));
       }
    }
    
    static void simplifyKeySetIterator() {
        //this show how keySetIterator() can be simpified
        System.out.println("<Simplify> Get the TreeMap keySet() and iterate "
               + "using the Iterator Interface");
        Iterator<Integer> iterator = tmap.keySet().iterator();
        while(iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key+", "+tmap.get(key));
        }
            
    }
    
    static void entrySetForEach() {
        System.out.println("Get the TreeMap entrySet() and iterate "
                + "using for-each loop");
        Set<Entry<Integer,String>> set = tmap.entrySet();
        for(Entry<Integer,String> key : set) {
            System.out.println(key.getKey()+", "+key.getValue());
        }
    }
    
    static void entrySetForEachMapInterface() {
        System.out.println("entrySet(), getKey() getValue() for-each loop "
                + "from the Map interface");
        for(Map.Entry<Integer,String> key : tmap.entrySet())
            System.out.println(key.getKey()+", "+key.getValue());
    }
    
    static void entrySetIterator() {
        System.out.println("Get the TreeMap entrySet() and iterate "
                + "using the Iterator Interface");
        Set set = tmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("League Position: "+mentry.getKey()+" Club: "
                +mentry.getValue());
            
        }
    }
    
    static void forEach() {
        System.out.println("Iterate a TreeMap using forEach()");
        tmap.forEach((key,value)->System.out.println(key+", "+value));
        
    }
    
    static void streamForEach() {
        System.out.println("Iterate a TreeMap using a Stream");
        tmap.entrySet().stream().forEach(e ->
                System.out.println(e.getKey()+", "+e.getValue()));
    }
    
    static void treeMapComparator() {
        
    }
    
    
    
    
    public static void main(String[] args) {
    
                
        populateTmap();
        keySetForEach();
        keySetForEachKey();
        keySetForEachValue();
        keySetIterator();
        simplifyKeySetIterator();
        entrySetForEach();
        entrySetForEachMapInterface();
        entrySetIterator();
        forEach();
        streamForEach();
        treeMapComparator();
    }
}
