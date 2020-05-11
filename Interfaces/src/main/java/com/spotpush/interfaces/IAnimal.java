/*
Animal Interface
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.interfaces;
/* Imports */

//- Interface methods (animalSound, run, sleep) do not have bodies
//  they are defined in the 'implements' file(s) dog.java, pig.java
//- Java doesn't support multiple inheritance, however interfaces are a way 
//  to achieve this because a class can implement multiple interfaces
//- Denote intefaces with I at the begining of their name 
//- on implementation you must override all of it's methods
public interface IAnimal {
    public void animalSound();//interface method with no body
    public void run();//interface method no body
    public void sleep();
}

