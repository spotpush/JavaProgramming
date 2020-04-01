/*
Pig class implements IAnimal Interface
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.interfaces;
/* Imports */

//- on implementation you must override all of an interfaces methods
//  if you don't declare each method then the Pig class is abstract
//- @Override annotation 
public class Pig implements IAnimal {
    
    public void animalSound() {
        //body of animalSound privided here
        System.out.println("The pig says: wee wee");
    }
    
    public void sleep() {
        //body of animalSound privided here
        System.out.println("zzz");
    }
    
    public void run() {
        //body of animalSound privided here
        System.out.println("run piggy run");
    }
}
