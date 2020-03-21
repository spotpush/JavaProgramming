/**
6. Write a Java program to generate and show the first 15 narcissistic decimal numbers.

A Narcissistic decimal number is a non-negative integer, n that is equal to the 
sum of the m-th powers of each of the digits in the decimal representation of n, 
where m is the number of digits in the decimal representation of n. and so 153 
is a narcissistic decimal number
* 
if n is 153
then m , (the number of decimal digits) is 3
we have 13 + 53 + 33 = 1 + 125 + 27 = 153
and so 153 is a narcissistic decimal number .
*/
/** @author Stephen Hardy @ spotpush.com  */
package com.spotpush.javaexercises;

/*Imports*/
import java.util.Scanner;

public class E6NarcissisticDecimalNumbers 
{
    public static void main(String[] args) 
    {
        int power =1;
        int sum = 0;
        Scanner usrObj = new Scanner(System.in);
        System.out.print("Integer: ");
        int narcNumber = usrObj.nextInt();
        if (narcNumber < 0) {
            System.out.print("Invalid integer");
        }
        String nNumber = Integer.toString(narcNumber);
        String[] nNum = nNumber.split("");
        for (int i=0;i<=nNum.length-1;i++){
            
            double val = (Integer.parseInt(nNum[i]));
            val = Math.pow(val, power);
            sum += val;
        }
        //if(sum==i){
        //    System.out.println(i+" Narcissistic Number");
        //}
     
            
            
        
        //read integer as an array to calculate = n
        //count the elements in the array = m
        //multiply each element to the power of the n
        //add them together
        
    }
}