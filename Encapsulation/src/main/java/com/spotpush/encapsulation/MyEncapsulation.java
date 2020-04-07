/*

*/
/** @author Stephen Hardy @ spotpush.com */
package com.spotpush.encapsulation;
/* Imports */


public class MyEncapsulation 
{
    public static void main(String[] args) 
    {
        //instantiate an object 'myObj' of class type 'Encapsulation'
        Encapsulation myObj = new Encapsulation();
        //since 'encapsulation' is a private string by using setEncapsulation
        //method declared within class 'Encapsulation' allows you to change
        //it to 'Kate'
        myObj.setEncapsulation("Kate");
        //which is then passed to 'getEncapsulation' and returned
        System.out.println(myObj.getEncapsulation());
    }
}
