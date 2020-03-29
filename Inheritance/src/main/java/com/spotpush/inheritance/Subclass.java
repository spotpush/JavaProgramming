/*

*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.inheritance;
/* Imports */

//superclass
class Superclass {
    int age;
    
    //arg constructor
    Superclass(int age) {
        this.age = age;
    }
    
    //subclass of the superclass
    public void getAge() {
        System.out.println("Variable named 'age' in Superclass is: "+age);
    }
}

//subclass
public class Subclass extends Superclass {
 
    //constructors have the same name of the class 
    //no return type; void
    //used to initialise data
    //arg constructor
    Subclass(int age){
        //Step 2 - passes 34 to superclass 
        super(age);
    }
    
    //subclass of subclass or superclass
    public static void main(String[] args) 
    {
        //instantiates Subclass making superclass available
        //Step 1 - passes '24' to Subclass
        Subclass s = new Subclass(34);
        s.getAge();
    }
}
