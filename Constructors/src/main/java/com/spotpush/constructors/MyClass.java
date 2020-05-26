/**
 * Constructors - A special method used to initialize objects
*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.constructors;
/* Imports */


public class MyClass {
    
    //instance variable
    int x;
        
    //no-arg class constructor
    public MyClass() {
        x = 10;
    }
    
    //arg class constructor - overloaded
    public MyClass(int y){
        x = y;
    }
    
    //multiple arg constructor - overloaded
    public MyClass(int y, int z) {
        x = y + z;
    }
    
    //calling a constructor from within a constructor
    //public MyClass(String y, String z) {
    //    this(y,z);
    //}
    
    public static void main(String[] args) {
        //instantiate MyClass object myObj
        MyClass myObj = new MyClass(); //calls no-arg MyClass constructor
        System.out.println(myObj.x); //prints 10
    
        //instantiate MyClass object myObj1
        MyClass myObj1 = new MyClass(5); //passes 5 to arg MyClass
        System.out.println(myObj1.x); //sets x to 5
    
        //instantiate MyClass object myObj2
        MyClass myObj2 = new MyClass(3,4); //passes 3,4 to multiple arg MyClass
        System.out.print(myObj2.x); //sets x to 7
    }
}
