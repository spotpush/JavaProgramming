/**
3. Write a Java program to generate random integers in a specific range.
*/
/** @author Stephen Hardy @ spotpush.com  */
package com.spotpush.javaexercises;

/*Imports*/
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class E3IntegersSpecificRange 
{
    public static void main(String[] args) 
    {
        //instanace declaration of the Scanner() & Random() classes
        Scanner usrObj = new Scanner(System.in);
        Random randomNumber = new Random();
        
        System.out.print("Min range value: ");
        int minRange = usrObj.nextInt();
        System.out.print("Max range value: ");
        int maxRange = usrObj.nextInt();
        
        //+1 makes maxRange inclusive, +minRange makes sure the number is higher
        //than the low
        int rNum = randomNumber.nextInt((maxRange - minRange)+1)+minRange;
        System.out.println("Random Number: "+rNum);
        
        //alternative way using IntStream
        //this defines 5 randomw numbers between 1 and 100
        IntStream ints = randomNumber.ints(5, minRange, maxRange);
        ints.forEach(System.out::println);
    }
}
