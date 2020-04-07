/**
 * Demonstrate encapsulation in Java
 * Encapsulation is also referred to as data hiding
*/

/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.encapsulation;

/* Imports */


public class Encapsulation 
{
    //class members - instance variables, methods

    //instance variable 'encapsulation'
    //private declaration means 'encapsulation' isn't accessible from outside
    //this class 
    private String encapsulation;
    
    //Getter - Read Only access, also referred to as an 'Accessor Method'
    //this 'get' method returns the value of the variable 'encapsulation'
    public String getEncapsulation() {
        return encapsulation;
    }
    //Setter - Write Only access, aldo referred to as a 'Mutator Method'
    //this 'set' method takes a parameter 'newEncapsulation' and assigns
    //it to the 'encapsulation' variable.  'this' refers to the current object
    public void setEncapsulation(String newEncapsulation) {
        this.encapsulation = newEncapsulation;
    }
}
