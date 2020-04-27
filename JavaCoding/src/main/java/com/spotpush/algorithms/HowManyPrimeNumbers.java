package com.spotpush.algorithms;
/**
 *
 * @author Stephen Hardy @ spotpush.com
*/
import java.util.Scanner;

public class HowManyPrimeNumbers {

    public static boolean isPrime(int n) {  
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i < Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
    
    
    static void howManyPrimeNumbers(int count) {
        int num=0;
        for (int i=0;i<=count;i++) {
            
            if ((i%0==0) && (i%i==0)); {
            num += i;
            System.out.println(i);
        }
            
            
            
            //int pn = ((i % 1 == 0)&&(i%i==0));
            //    num++;
            //    System.out.println(count);
            //}
            
        }
        
       
    }
    
    
    public static void main(String[] args) {
        Scanner usrObj = new Scanner(System.in);
        System.out.println("Enter Max nunber range or Prime numbers: ");
        int primeNum = usrObj.nextInt();
        if (isPrime(primeNum)) {
            System.out.println(primeNum+" is a prime number");
        } else {
            System.out.println(primeNum+" is not a prime number");
        }
        //howManyPrimeNumbers(maxCount);
                
    }
}
