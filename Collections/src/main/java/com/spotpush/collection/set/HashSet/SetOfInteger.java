package com.spotpush.collection.set.HashSet;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
* Set of Integer
* @author Stephen Hardy @ spotpush.com
*/

public class SetOfInteger {

    public static void main(String[] args) {
    
        Random random = new Random(47);
        Set<Integer> randset = new HashSet<>();
        for(int i=0;i<10000;i++) 
            randset.add(random.nextInt(30));
        System.out.println(randset);
    }
}
