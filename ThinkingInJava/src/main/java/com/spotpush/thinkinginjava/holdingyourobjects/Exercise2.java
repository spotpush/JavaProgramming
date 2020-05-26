package com.spotpush.thinkinginjava.holdingyourobjects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
* Modify SimpleCollection.java to use a Set for c.
* import java.util.*;
* public class SimpleCollection {
*   public static void main(String[] args) {
*       Collection<Integer> c = new ArrayList<Integer>();
*       for(int i = 0; i < 10; i++)
*       c.add(i); // Autoboxing
*       for(Integer i : c)
*       System.out.print(i + ", ");
*       }
* }
* @author Stephen Hardy @ spotpush.com
*/

public class Exercise2 {

    public static void main(String[] args) {
    
        /**
         * Notice HashSet has been upcast to Collection
         * By using Collection Interface it's possible to change the
         * implementation at the point of creation 
         * by changing 'new HashSet<>();' to 'new ArrayList<>();
         * There are limitations on upcasting
         */ 
        Collection<Integer> c = new HashSet<>();
        for(int i=0;i<10;i++)
            c.add(i);
        for(Integer i : c)
            System.out.println(i+", ");
    }
}
