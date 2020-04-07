/**
*
* @author Stephen Hardy @ spotpush.com
*/
package com.spotpush.datatypes;
/* Imports */


public class PrimitiveDataTypes {
    
    
    byte Byte; //8-bit siged 2's compliment integer -128 +127 inclusive
    short Short; //16-bit signed 2's compliment integer -32,768 +32,767 inclusive 
    int x; //
    long y;
    float f;
    double d;
    boolean choice;
    char c;
    String str;
    
    public static void main(String[] args) {
        
        PrimitiveDataTypes pdt = new PrimitiveDataTypes();
        
        System.out.println(pdt.Byte);
        System.out.println(pdt.Short);
        System.out.println(pdt.x);
        System.out.println(pdt.y);
        System.out.println(pdt.f);
        System.out.println(pdt.d);
        System.out.println(pdt.choice);
        System.out.println(pdt.c);
        System.out.println(pdt.str);
        
    }
}
