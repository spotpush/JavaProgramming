/*

*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.interfaces;
/* Imports */


public class Dog implements IAnimal {
    
    public void animalSound() {
        //body of animalSound privided here
        System.out.println("The Dog says: woff woff woff");
    }
    
    public void sleep() {
        //body of animalSound privided here
        System.out.println("zzz");
    }
    
    public void run() {
        //body of animalSound privided here
        System.out.println("run doggy run");
    }
}