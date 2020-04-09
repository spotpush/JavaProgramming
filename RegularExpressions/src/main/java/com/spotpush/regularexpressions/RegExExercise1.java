/**
* 
* @author Stephen Hardy @ spotpush.com
*/
package com.spotpush.regularexpressions;
/* Imports */
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExExercise1 {

    public static void main(String[] args) {
        
        /**
         * Check for alphanumeric input
         */
        Scanner usrObj = new Scanner(System.in);
        boolean isMatch; //false
        do {
            String pattern = "[a-zA-Z0-9]{1,2}";    
            System.out.print("Please enter an 2 digit alphanumeric character: ");
            String usrInp = usrObj.nextLine();
            isMatch = Pattern.matches(pattern,usrInp); 
            if (!isMatch) System.out.println("Invalid Entry: "+usrInp);
        } while (!isMatch);
    }
}
