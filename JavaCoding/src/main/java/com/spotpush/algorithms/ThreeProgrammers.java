package com.spotpush.algorithms;
/**
 * You hired three programmers and you (hopefully) pay them. 
 * Create a function that takes three numbers (the hourly wages of 
 * each programmer) and returns the difference between the highest-paid 
 * programmer and the lowest-paid.
 * 
 * programmers(147, 33, 526) ➞ 493
 * programmers(33, 72, 74) ➞ 41
 * programmers(1, 5, 9) ➞ 8
 * 
 * @author Stephen Hardy @ spotpush.com
*/
import java.util.Scanner;

public class ThreeProgrammers {

    public static void main(String[] args) {
        
        int p1,p2,p3;
        int l,h,d;
        Scanner usrObj = new Scanner(System.in);
        System.out.print("Programmer Salary 1: ");
        p1 = usrObj.nextInt();
        System.out.print("Programmer Salary 2: ");
        p2 = usrObj.nextInt();
        System.out.print("Programmer Salary 3: ");
        p3 = usrObj.nextInt();
                
        if ((p1 > p2) && (p1 > p3)) {
            h = p1;
        }else if (p2 > p3) {
            h = p2;
        }else {
            h=p3;
        }
        
        if ((p1 < p2) && (p1<p3)){
            l = p1;
        }else if (p2 < p3) {
            l=p2;
        }else {
            l=p3;
        }
    d = h-l;
    System.out.println("Highest Programmer Salsry: "+h);
    System.out.println("Lowest Programmer Salary: "+l);
    System.out.println("Difference between Highest and Lowest: "+d);
    }
}
