package com.spotpush.map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
* HashMap are unordered unlike TreeMap which is ordered according
* to natural order
* @author Stephen Hardy @ spotpush.com
*/

public class HashMapExample {

    private static final Logger LOGGER = LogManager.getLogger(HashMapExample.class.getName());
    
    public static void main(String[] args) {
    
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(3,"Elizabeth");
        hmap.put(6,"Ana");
        hmap.put(41,"Kate");
        hmap.put(42,"Stephen");
        LOGGER.info("===================================");
        LOGGER.info("============ New Run ==============");
        LOGGER.info("===================================");
        LOGGER.info("Create HashMap "+hmap);
        
        Scanner userObj = new Scanner(System.in);
        System.out.println("Enter Option: ");
        System.out.println("1 - Clear()");
        System.out.println("2 - Iterate HashMap");
        int option1 = userObj.nextInt();
        LOGGER.info("Main Menu Option: "+option1);
        switch (option1) {
            case 1:
                clearHashMap(hmap);
                break;
            case 2:
                System.out.println("How would you like to traverse the HashMap");
                System.out.println("1 - Keys (For-Each Loop)");
                System.out.println("2 - Entries (For-Each Loop)");
                System.out.println("3 - Values");
                System.out.println("4 - For-Each Loop (Both Keys and Values");
                int option2 = userObj.nextInt();
                LOGGER.info("Traverse HashMap Option: "+option2);
                switch (option2) {
                    case 1:
                        System.out.println("Keys or Values");
                        System.out.println("1 - Keys");
                        System.out.println("2 - Values");
                        int option3 = userObj.nextInt();
                        LOGGER.info("Keys or Values Option: "+option3);
                        switch (option3) {
                            case 1:
                                traverseHashMapKeysJustKeys(hmap);
                                break;
                            case 2:
                                traverseHashMapKeysJustValues(hmap);
                                break;
                        }
                        break;
                    
                    case 2:
                        traverseHashMapEntries(hmap);
                        break;
                        
                    case 3:
                        traverseHashMapValues(hmap);
                        break;
                        
                    case 4:
                        traverseHashMapForEachLoop(hmap);
                        break;
                }
                    
                
            
        }
        
        
    }
    
    public static void clearHashMap(HashMap hmap) {
        System.out.println(hmap);
        hmap.clear();
        System.out.println(hmap);
        
    }
    
    public static void traverseHashMapKeysJustKeys(HashMap<Integer,String> hmap) {
        LOGGER.traceEntry(" JustKeys() "+hmap);
        System.out.println("This uses <HashMap>.KeySet() to return \"Keys\"");
        for(Integer key : hmap.keySet()) {
            System.out.println("Key: "+key);
            LOGGER.trace("select each key: "+key);
        }
        LOGGER.traceExit(" JustKeys() "+hmap);
    }
    
    public static void traverseHashMapKeysJustValues(HashMap<Integer,String>hmap) {
        LOGGER.traceEntry(" JustValues() "+hmap);
        System.out.println("This uses <HashMap>.values() to return \"values\"");
        for(String value : hmap.values()) {
            System.out.println("Values: "+value);
            LOGGER.debug(value);
        }
        LOGGER.traceEntry(" JustValues() "+hmap);
    }
    
    public static void traverseHashMapEntries(HashMap<Integer,String> hmap) {
        for (Map.Entry<Integer,String> entry : hmap.entrySet()) {
            System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
        }
    }
    
    public static void traverseHashMapValues(HashMap hmap) {
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("Key is: "+mentry.getKey()+", Value is: "
                    + mentry.getValue());
        }
    }
    
    public static void traverseHashMapForEachLoop(HashMap<Integer,String> hmap) {
        System.out.println("This uses <HashMap>.entrySet() to return \"keys\" & \"values\"");
        for (Map.Entry<Integer,String> entry : hmap.entrySet()) {
            System.out.println(entry.getKey()+", "+entry.getValue());
        }
    }
    
}
