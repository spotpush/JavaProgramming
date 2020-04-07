/**
*
* @author Stephen Hardy @ spotpush.com
*/

package com.spotpush.datatypes;

/* Imports */


public class Variables {

    //instance variables - non-static fields
    //value of instance variables are unique to each instance of a class
    int x;
    
    //class variables - static fields
    //static fields tell the compiler that there is only one copy of this variable
    //in existance regardless of how many times it's instantiated
    static int numGears = 21;
    
    //adding 'final' to a static class variable makes it (numBreaks) immutable
    final static int ROAD_BIKE_BREAKS = 2;
    final static int BMX_BIKE_BREAKS = 1;
    
    //local variables - defined by being between 
    public Variables() {
        int x; 
    }
    
    //parameters
    
    public static void main(String[] args) {
    
    }
}
