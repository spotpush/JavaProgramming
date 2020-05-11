package com.spotpush.enumeratedtype.pizzaexpress.NESW;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class DirectionsExample {

    public static void main(String[] args) {
        
        /**
         * Lists constants (NORTH, SOUTH...) in the enum enumDirections
         */
        for (enumDirections eDir : enumDirections.values()) {
            System.out.println("Direction Short Code: "+eDir);
            
        }
        
        /**
         * Lists fields (N, S...) of constants in the enum enumDirections 
         */
        for (enumDirections eDir : enumDirections.values()) {
            System.out.println("Direction Short Code: "+eDir.getEnumDirections());
            
        }
        
    }
}
