/**
Write a Java program to classify Abundant number (integers) 
between 1 to 10,000.
In number theory, an abundant number is a number for which the sum of its 
proper divisors is greater than the number itself.
Example :
The first few abundant numbers are:
12, 18, 20, 24, 30, 36, 40, 42, 48, 54, 56, 60, 66, 70, 72, 78, 80, 84, 
88, 90, 96, 100, 102,…
The integer 12 is the first abundant number. Its proper divisors are 1, 2, 
3, 4 and 6 for a total of 16.
*/
/** @author Stephen Hardy @ spotpush.com  */
package com.spotpush.javaexercises;

/*Imports*/
import java.util.Scanner;

public class E2ClassifyAbundentNumbers 
{
    public static void main(String[] args) 
    {
        int maxRange = 10000;
        Scanner usrObj = new Scanner(System.in);
        System.out.print("Abundant Number: ");
        int num = usrObj.nextInt();
        int count = 0;
        //The integer 12 is the first abundant number. 
        //Its proper divisors are 1, 2, 3, 4 and 6 for a total of 16.
        for (int i = 1;i<num;i++) {
            if (num % i == 0) {//num is divisible by i 
                count += i; //add number to count
                if (count > num) {
                    System.out.print(+num+" is an Adundent Number");
                }
                else {
                    i++;
                }
            }
            else {
                System.out.print(+num+" is not an Abundent Number");
            }
                
        }
    }
}
