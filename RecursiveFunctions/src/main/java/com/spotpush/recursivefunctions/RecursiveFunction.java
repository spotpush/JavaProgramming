package com.spotpush.recursivefunctions;
/**
 * Recursive Function HelloWorld Factorial Function
 * @author Stephen Hardy @ spotpush.com
*/

public class RecursiveFunction {

    public static long factorial(int n) { 
        if (n == 1) return 1; 
        return n * factorial(n-1); 
    } 
    public static void main(String[] args) {
        factorial(10);
        
    }
}
