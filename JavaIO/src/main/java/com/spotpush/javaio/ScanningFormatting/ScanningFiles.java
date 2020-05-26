package com.spotpush.javaio.ScanningFormatting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
* Scanning objects of type Scanner are useful for breaking down formatted
* input into tokens and translating individual tokens according to their data
* type
* By default Scanner uses white spaces to separate tokens see 
* Character.isWhitespace() for a full list of white space types
* @author Stephen Hardy @ spotpush.com
*/

public class ScanningFiles {

    static void scanXanadu() throws FileNotFoundException {
        Scanner usrObj = null;
        try {
            usrObj = new Scanner(new BufferedReader(new 
                FileReader("C://JavaIOFiles//oraclelessons//xanadu.txt")));
            /**
             * useDelimiter() allows you to specify different separators
             * from the default white-spaces with regular expressions.  
             * The following adds a comma ',' and white spaces '\s' occurs
             * one or more times '*'.  The additional slash separates the comma
             * from the \s to be used together
             */
            usrObj.useDelimiter(",\\s*");
            while (usrObj.hasNext()) {
                System.out.println(usrObj.next());
            }    
        } finally {
            if (usrObj != null) {
                usrObj.close();
            }
        
        }
    }
    
    static void scanXanaduSum() throws FileNotFoundException, 
            IOException {
        
        Scanner usrObj = null;
        double sum = 0;
        try {
            usrObj = new Scanner(new BufferedReader(new 
                FileReader("C://JavaIOFiles//oraclelessons//usnumbers.txt")));
            usrObj.useLocale(Locale.US);
            while (usrObj.hasNext()) {
                if (usrObj.hasNextDouble()) {
                    sum += usrObj.nextDouble();
                }else {
                    usrObj.next();
                }
            }
        }finally {
            usrObj.close();
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) throws FileNotFoundException, 
            IOException {
    
        try {
            scanXanadu();
            System.out.println("==============================");
            scanXanaduSum();
        } catch (IOException ioe) {
            ioe.printStackTrace();
            }
        }
    
}
