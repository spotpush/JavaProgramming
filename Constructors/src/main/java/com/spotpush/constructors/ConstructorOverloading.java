package com.spotpush.constructors;

/**
* Overloaded Constructors
* The reason for overloading constructors is to create more than one constructor
* for doing different tasks
* To differentiate between constructors java loos at the differing parameter lists
* @author Stephen Hardy @ spotpush.com
*/

public class ConstructorOverloading {

    /**
     * Three different ConstructorOverloading() constructors which can be
     * used to carry out different tasks
     */
    ConstructorOverloading(){
        //no arg
    }
    
    ConstructorOverloading(String s) {
        //String arg
    }
    
    ConstructorOverloading(int i) {
        //int arg
    }
    
    
    
    public static void main(String[] args) {
    
    }
}
