package com.spotpush.collection.set.sortedset.treeset;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class SortedSetOfInteger {

    public static void main(String[] args) {
    
        Random random = new Random(47);
        SortedSet<Integer> randset = new TreeSet<>();
        for(int i=0;i<10000;i++)
            randset.add(random.nextInt(30));
        System.out.println(randset);
    }
}
