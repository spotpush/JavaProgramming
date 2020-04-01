/*
Implements IAnimal
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.interfaces;
/* Imports */


public class MyMainClass {
    
    public static void main(String[] args) {
    
        Pig myPig = new Pig(); //create a Pig object
        myPig.animalSound();
        myPig.sleep();
        myPig.run();
        
        Dog myDog = new Dog(); //create a Dog object
        myDog.animalSound();
        myDog.sleep();
        myDog.run();
        
    }
}
