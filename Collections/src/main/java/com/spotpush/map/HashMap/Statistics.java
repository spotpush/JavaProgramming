package com.spotpush.map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class Statistics {

    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<10000;i++) {
            int r = random.nextInt(20);
            Integer frequency = m.get(r);
            m.put(r, frequency == null ? 1:frequency+1);
        }
        System.out.println(m);
    }
}
