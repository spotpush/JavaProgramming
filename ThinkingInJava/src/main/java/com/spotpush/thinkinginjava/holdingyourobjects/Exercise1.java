package com.spotpush.thinkinginjava.holdingyourobjects;

import java.util.ArrayList;

/**
*  Create a new class called Gerbil with an int
 * gerbilNumber initialized in the constructor.
 * Give it a method called hop() that prints out
 * which gerbil number this is, and that it’s hopping.
 * Create an ArrayList and add Gerbil objects to
 * the List. Now use the get() method to move
 * through the List and call hop() for each Gerbil. 
* @author Stephen Hardy @ spotpush.com
*/

//1 - Create a new class called Gerbil
class Gerbil {
    //2 - int gerbilNumber variable
    private final int gerbilNumber;

    //3 - initialise gerbalNumber in a constructor
    Gerbil(int gerbalNumber) {
        this.gerbilNumber = gerbalNumber;
    }
    
    @Override
    public String toString() {
        return "gerbil " + gerbilNumber;
    }
    
    //4 - method hop prtins gerbil number and "it's hopping"
    public void hop() {
        System.out.println(this+" is hopping");
    }
}


public class Exercise1 {

    public static void main(String[] args) {
    
        //4 - Create ArrayList and add Gerbil objects
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        
        //5 - use get() to move through the ArrayList and call hop for each gerbil
        for (int i = 0;i<10;i++)
            gerbils.add(new Gerbil(i));
        for (int i = 0;i<gerbils.size();i++)
            gerbils.get(i).hop();
        }
}
