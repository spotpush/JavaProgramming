/**
* 
* @author Stephen Hardy @ spotpush.com
*/
package com.spotpush.regularexpressions;
/* Imports */
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExExercise2 {

    public static void main(String[] args) {
        
        /**
         * Create a regular expression that accepts 10 digit numeric characters 
         * starting with 7, 8 or 9 only.
         */
        Scanner usrObj = new Scanner(System.in);
        boolean isMatch; //false
        do {
            String pattern = "[789]{1}[0-9]{9}";    
            System.out.print("Please enter a 10 digit numeric number starting with 7, 8 or 9: ");
            String usrInp = usrObj.nextLine();
            isMatch = Pattern.matches(pattern,usrInp); 
            if (!isMatch) System.out.println("Invalid Entry: "+usrInp);
        } while (!isMatch);
    }
}
