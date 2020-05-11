package com.spotpush.enumeratedtype.pizzaexpress.NESW;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public enum enumDirections {

    NORTH ("N"),
    SOUTH ("S"),
    WEST ("W"),
    EAST ("E");
    
    private final String shortCode; //field called shortCode

    enumDirections(String shortCode) {
        this.shortCode = shortCode;
    }
    
    public String getEnumDirections() { //getter method for shortCode
        return this.shortCode;
    }
    
    
}
