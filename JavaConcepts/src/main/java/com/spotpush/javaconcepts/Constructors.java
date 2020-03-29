/*
Understanding Cnstructors
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.javaconcepts;
/* Imports */


public class Constructors 
{
    int a;
    String b;
            
    //Type 1 - Default.  Undeclared in java file however added inserted during
    //compilation
        
    //Type 2 - no-arg constructor
    Constructors(){
        System.out.println("This constructors has no arguments");
    }
    
    //Type 3 - Parameters
    Constructors(int a, String b){
        this.a = a;
        this.b = b;
    }
       
    public static void main(String[] args) 
    {
        //calling Type 2 Constructor
        
            //this doesn't create anything and will be up for Garbage Collection 
            //as soon as the program is run
            new Constructors(); 
            
            //this approach assigned a variable to the new object
            Constructors type2 = new Constructors();
        
        //Calling Type 3 - Constructor
        
            Constructors type3 = new Constructors(41,"Stephen");
        
    }
}
