/**

*/
/** @author Stephen Hardy @ spotpush.com  */
package com.spotpush.javaexercises;

/*Imports*usr */
import java.util.Scanner;

public class E1DirtyNumbers 
{
    public static void main(String[] args) 
    {
        Scanner usrObj = new Scanner(System.in);
        System.out.print("Value: ");
        int val = usrObj.nextInt();
        if (val < 0){
            System.out.print("Value Invalid");
        }
        int x = 0;
        while (val != 1) {
               
            if (val % 5 == 0) { //if no remainder then true (val is exactly divisible by 5) 
                val /= 5; //if true then 
            }
            else if (val % 3 ==0) {
                val /= 3;
            }
            else if (val % 2 ==0) {
                val /= 2;
            }
            else {
            System.out.print("Not an ugly nunber");
            x = 1;
            break;
            }
        }
        if (x == 0){
            System.out.print("is an ugly number");
        }
        
    }
}
