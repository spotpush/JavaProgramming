/**
class file for working with inheritance
*/
/** @author Stephen Hardy @ spotpush.com  */
package com.spotpush.inheritance;

/*Imports*/

class Base 
{
    public void show() {
        System.out.println("Base::show() called");
    }
}   
 
class Derived extends Base {

    public void show() {
        System.out.println("Derived::show() called");
    }
}
    
  
public class Inheritance {
    public static void main(String[] args)
    {
        Base b = new Derived();
        b.show();
    }
}
