/**
* 
* @author Stephen Hardy @ spotpush.com
*/
package com.spotpush.regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/* Imports */


public class RegExFinder {

    public static void main(String[] args) {
    
        Scanner usrObj = new Scanner(System.in);
        while (true) {
            System.out.println("Enter regex pattern: ");
            Pattern p = Pattern.compile(usrObj.nextLine());
            System.out.println("Enter text: ");
            Matcher m = p.matcher(usrObj.nextLine());
            boolean found = false; //initialise found
            while (m.find()) {
                System.out.println("Text found "+m.group()+" starting at index+"
                        + m.start()+" and ending at "+m.end());
                found = true;
            }
            if(!found){
                System.out.println("No matches found.");
            }
       }
    }
}
