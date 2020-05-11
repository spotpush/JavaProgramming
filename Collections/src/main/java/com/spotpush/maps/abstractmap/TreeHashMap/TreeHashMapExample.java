package com.spotpush.maps.abstractmap.TreeHashMap;

import java.util.Iterator;
import java.util.Map;
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
* 
* This class explores the TreeMap map for storing data
* @author Stephen Hardy @ spotpush.com
*/

public class TreeHashMapExample {

    public static void main(String[] args) {
    
        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(1,"MCFC");
        tmap.put(20,"MUFC");
        tmap.put(2,"LFC");
        tmap.put(4,"THFC");
        tmap.put(3,"CFC");
        
        Set set = tmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("League Position: "+mentry.getKey()+" Club: "
                +mentry.getValue());
            
        }
    }
}
