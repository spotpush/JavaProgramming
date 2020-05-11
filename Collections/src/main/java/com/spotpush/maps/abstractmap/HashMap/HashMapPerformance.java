package com.spotpush.maps.abstractmap.HashMap;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class HashMapPerformance {

    //Set up the HashMap
    static HashMap<String,Integer> testMap = new HashMap<>();
    
    //populate the HashMap
    static {
        for(int i=0;i<5_00_000;i++) {
            testMap.put("key_"+i,i);
        }
    }
    
    public static void main(String[] args) {
    
        //capture the start time from the PC it's running on
        long startTime = Calendar.getInstance().getTimeInMillis();
        
        //iterate over the HashMap 
        for(Map.Entry<String,Integer> entry : testMap.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
        
        //print end time minus startTime
        System.out.println("Using entrySet(): " 
                +(Calendar.getInstance().getTimeInMillis() - startTime));
    }
}
