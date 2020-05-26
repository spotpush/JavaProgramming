package com.spotpush.map.sortedmap.navigablemap.TreeMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class TreeMapExercises {

    static Scanner usrObj = new Scanner(System.in);
    
    static TreeMap<Integer,String> tMap = new TreeMap<>();
    
    static void populatetMap() {
        tMap.put(1,"Claudi Bravo");
        tMap.put(31,"Ederson");
        tMap.put(33,"Scott Carson");
        tMap.put(2,"Kyle Walker");
        tMap.put(5,"John Stones");
        tMap.put(14,"Aymeric Laporte");
        tMap.put(22,"Benjamin Mendy");
        tMap.put(30,"Nicholas Otamendi");
        tMap.put(11,"Oleksandr Zinchenko");
        tMap.put(27,"Joao Cancelo");
        tMap.put(50,"Eric Garcia");
        tMap.put(72,"Taylor Harwood-Bellis");
        tMap.put(88,"Alpha Richard Dionkou");
        tMap.put(8,"Ilkay Gundogan");
        tMap.put(17,"Kevin De Bruyne");
        tMap.put(20,"Bernardo Silva");
        tMap.put(21,"David Silva");
        tMap.put(25,"Fernandinho");
        tMap.put(47,"Phil Foden");
        tMap.put(16,"Rodrigo");
        tMap.put(100,"Adrian Bernabe"); //key can not be 'null'
        tMap.put(69,"Tommy Doyle");
        tMap.put(26,"Riyad Mahrez");
        tMap.put(7,"Raheem Sterling");
        tMap.put(10,"Sergio Aguero");
        tMap.put(19,"Leroy Sane");
        tMap.put(9,"Gabriel Jesus");
    }
    
    public static void question1() {
        System.out.println("Write a Java program to associate the specified "
                + "value with the specified key in a Tree Map.");
        populatetMap();
        tMap.forEach((key,value)->System.out.println(key+", "+value));
        
    }
    
    public static void question2() {
        System.out.println("Write a Java program to copy a Tree Map content "
                + "to another Tree Map.");
        populatetMap();
        //Shallow Copy (keys and values are not cloned) - clone()
        //what makes clone() shallow is the fact it doesn't modify mutable objects
        //method 1
        System.out.println("simple call: tMap.clone()\n"+tMap.clone());
        //method 2
        System.out.println("Create a new TreeMap and cast (TreeMap).tMap.clone()\n");
        TreeMap<Integer,String> tMapClone = (TreeMap)tMap.clone();
        System.out.println("Shallow copy of tMap to tMapClone: "+tMapClone);
        //method 3
        TreeMap<Integer,String> tMapClone1 = new TreeMap<>(tMap);
        System.out.println("Create a new TreeMap and new TreeMap<>(tMap)\n"+tMapClone1);
        //method 4
        TreeMap<Integer,String> tMapPutAll = new TreeMap<>();
        tMapPutAll.putAll(tMap);
        System.out.print("Another shallow method using putAll() \n"+tMapPutAll+"\n");
    
    }
    
    public static void question3() {
        System.out.println("Write a Java program to search a key in a Tree Map.");
        populatetMap();
        //list all keys
        //System.out.println("For Loop listing all Keys: ");
        //for(Integer key : tMap.keySet()) {
        //    System.out.println(key);
        //}
        
        System.out.println("Does Key exist in tMap: ");
        int squadNumber = usrObj.nextInt();
        if (tMap.containsKey(squadNumber)){
            System.out.println("tMap contains: "+squadNumber);
        } else {
            System.out.println("tMap does not contain: "+squadNumber);
        }
    }
    
    public static void question4() {
        System.out.println("Write a Java program to search a value in a Tree Map.");
        populatetMap();
        String playerName = usrObj.nextLine();
        if(tMap.containsValue(playerName)){
            System.out.println("Contains: "+playerName);
        } else {
            System.out.println("Does not contain: "+playerName);
        }
        
    }
    
    public static void question5() {
        
    }
    
    public static void question6() {
        
    }
    
    public static void question7() {
        
    }
    
    public static void question8() {
        
    }
    
    public static void question9() {
        
    }
    
    public static void question10() {
        
    }
    
    public static void question11() {
        
    }
    
    public static void question12() {
        
    }
    
    public static void question13() {
        
    }
    
    public static void question14() {
        
    }
    
    public static void question15() {
        
    }
    
    public static void question16() {
        
    }
    
    public static void question17() {
        
    }
    
    public static void question18() {
        
    }
    
    public static void question19() {
        
    }
    
    public static void question20() {
        
    }
    
    public static void question21() {
        
    }
    
    public static void question22() {
        
    }
    
    public static void question23() {
        
    }
    
    public static void question24() {
        
    }
    
    public static void question25() {
        
    }
    
    public static void question26() {
        
    }
    
    public static void question27() {
        
    }
    
    public static void question28() {
        //Create an immutable TreeMAP
                
    }
    
    public static void question29() {
        //display the comparator
        
        populatetMap();
        Comparator comp = tMap.comparator();
        //Comparator reverse = tMap.comparator(Collections.reverseOrder());
        TreeMap<Integer, String> reversetMap = new TreeMap<>
            (Collections.reverseOrder());
        
        Comparator reversecomp = reversetMap.comparator();
        if (comp == null) {
            System.out.println(comp+" means tMap implements natural ordering");
        } 
        if (reversecomp == null) {
            System.out.println(reversecomp+" means reversecomp implements natural ordering");
        } else
            System.out.println("reversecomp implements "+reversecomp);
        
    }
    
    public static void question30() {
        //create a deep copy of a TreeMap
        
        
    }
           
public static void main(String[] args) {
    
    }
}
