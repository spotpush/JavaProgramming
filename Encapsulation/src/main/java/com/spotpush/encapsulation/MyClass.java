/*

*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.encapsulation;
/* Imports */

public class MyClass 
{
    public static void main(String[] args) {
        Encapsulation myObj = new Encapsulation();
        //encapsulation has private access so variable not accessable
        //if encapsulation was declared as public 'Stephen' would be displayed
        myObj.encapsulation = "Stephen"; 
        System.out.println(myObj.encapsulation); //same here
    }
}
