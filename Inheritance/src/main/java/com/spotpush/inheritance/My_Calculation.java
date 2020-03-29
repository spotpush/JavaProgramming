/*

*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.inheritance;
/* Imports */


//superclass
class Calculation {
    
    int z;
    
    //parameterised constructor
    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers: "+z);
    }
    public void subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers: "+z);
    }
}

//subclass My_Calculation extends superclass Calculation
//Inherits all the members (fields,methods and nested classes) 
public class My_Calculation extends Calculation {
    
    //subclass of My_Calculation
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers: " +z);
    }
    
    public static void main(String[] args) {
        int a = 20, b = 10;
        
        //By instantiating an object 'demo' of class 'My_Calculation'
        //a copy of the superclass 'Calculation' is made within it because
        //My_Calculation extends Calculation
        //this also gives you access
        My_Calculation demo = new My_Calculation();
        demo.addition(a, b);
        demo.subtraction(a, b);
        demo.multiplication(a, b);
    }
}


