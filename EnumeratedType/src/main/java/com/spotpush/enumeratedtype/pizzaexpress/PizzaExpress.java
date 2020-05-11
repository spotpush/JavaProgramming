package com.spotpush.enumeratedtype.pizzaexpress;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class PizzaExpress {

    public static void main(String[] args) {
    
        /**
         * iterate over the EnumPizzaStatus enum
         */
        for (EnumPizzaStatus key : EnumPizzaStatus.values()) {
            System.out.println("Different Order States: "+key);
        }
              
    }
}
