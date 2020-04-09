/**
* Handling Regular Expressions
* @author Stephen Hardy @ spotpush.com
*/
package com.spotpush.regularexpressions;
/* Imports */
import java.util.Scanner;

public class RegExExercises {

    public static void main(String[] args) {
    
        /**
         * Create a regular expression that accepts alphanumeric characters only 
         * Its length must be six characters long only.
         */
        Scanner usrObj = new Scanner(System.in);
        boolean flag;
        
        do {
            String inputPattern = "[a-zA-Z0-9]{0,6}";
            System.out.print("Please enter an alphanumeric character of upto 6 characters: ");
            String usrInp = usrObj.nextLine();
            flag = usrInp.matches(inputPattern);
            if (!flag)
                System.out.println("Invalid Input");
        } while (!flag);
        System.out.println("Valid Input: ");
        
    }
}
