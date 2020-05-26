package com.spotpush.map.sortedmap.navigablemap.TreeMap;

import java.util.TreeMap;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class TreeHashMapPerformance {

    static TreeMap<Integer, String> tmap = new TreeMap<>();
    
    static {
        for (int i = 0;i<1000;i++)
            tmap.put(i,i+" Key");
    }
    
    public static void main(String[] args) {
    
        System.out.print(tmap);
    }
}
