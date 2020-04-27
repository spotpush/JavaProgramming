package com.spotpush.algorithms;
/**
 * Create a function that, given a number, returns the corresponding Fibonacci number.
 * Fibonacci(3) ➞ 3
 * Fibonacci(7) ➞ 21
 * Fibonacci(12) ➞ 233
 * @author Stephen Hardy @ spotpush.com
*/
import java.util.Scanner;
public class FibonacciNumber {

    static int n1=0,n2=1,n3=0;    
    
    static void printFibonacci(int count){    
        
        //for (int i=0; i<fibNum; i++) {
            
            if(count>0){    
                n3 = n1 + n2;    
                n1 = n2;    
                n2 = n3;    
                System.out.print(" "+n3);   
                printFibonacci(count-1);    
            }
        //} System.out.println("nth Fib Number: ");
    }    
 
    public static void main(String args[]){    
        int count=10, nth;    
        Scanner usrObj = new Scanner(System.in);
        System.out.print("Enter nth Fib Number: ");
        nth = usrObj.nextInt();
        System.out.print(n1+" "+n2);//printing 0 and 1    
        printFibonacci(count-2);//n-2 because 2 numbers are already printed   
 }  
}
