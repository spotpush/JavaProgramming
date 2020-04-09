/**
* using regular expressions in Java
* @author Stephen Hardy @ spotpush.com
*/
package com.spotpush.regularexpressions;
/* Imports */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {
        
        /**
         * 3 ways to write regular expressions in Java
         * 1st way
         */
        Pattern p = Pattern.compile(".s"); //single character in 2nd place
        Matcher m = p.matcher("as"); //matches 's'
        boolean b = m.matches(); //true
        
        /**
         * 2nd way
         */
        boolean b2=Pattern.compile(".s").matcher("as").matches();
        
        /**
         * 3rd way
         */
        boolean b3 = Pattern.matches(".s", "as");
        
        
        System.out.println(b+" "+b2+" "+b3);
        
        /**
         * Regular Expression Examples
         */
        System.out.println("Regular Expressions");
        System.out.println(Pattern.matches(".s", "as")); //true 2nd char is s
        System.out.println(Pattern.matches(".s", "mk")); //false 2nd char is not s
        System.out.println(Pattern.matches(".s", "mst")); //false more that 2 chars
        System.out.println(Pattern.matches(".s", "amms")); //false more than 2 chars
        System.out.println(Pattern.matches("..s", "mas")); //true 3rd char is s
        
        /**
         * Character Classes
         */
        System.out.println("Character Classes");
        System.out.println("[abc] define ranges of individual characters");
        System.out.println(Pattern.matches("[amn]", "abcd")); //false not a m n
        System.out.println(Pattern.matches("[amn]", "a")); //true a within range
        System.out.println(Pattern.matches("[amn]", "ammmna")); //false a m more than once
        
        /**
         * Regular Expression Qualifiers
         */
        System.out.println("Regular Expressions Quantifiers");
        System.out.println("? (Greedy) quantifier occurs 1 or not at all..");
        System.out.println(Pattern.matches("[amn]?", "a")); //true 
        System.out.println(Pattern.matches("[amn]?", "m")); //true
        System.out.println(Pattern.matches("[amn]?", "n")); //true
        System.out.println(Pattern.matches("[amn]?", "aaa")); //false a more than once 
        System.out.println(Pattern.matches("[amn]?", "aammmnn")); //false a,m,n more than once
        System.out.println(Pattern.matches("[amn]?", "azzt")); //false a more than once
        System.out.println(Pattern.matches("[amn]?", "am")); //false a,m,n one time
        
        //System.out.println("?? (Reluctant) quantifier matches 0 or more..");
        //System.out.println("?+ (Possessive) quantifier matches 0 or more..");
        
        System.out.println("+ (Greedy) quantifier occurs 1 or more..");
        System.out.println(Pattern.matches("[amn]+", "a")); //true
        System.out.println(Pattern.matches("[amn]+", "aaa")); //true
        System.out.println(Pattern.matches("[amn]+", "aammmnn")); //true
        System.out.println(Pattern.matches("[amn]+", "aazzta")); //false
        
        System.out.println("* (Greedy) quantifier occurs 0 or more..");
        System.out.println(Pattern.matches("[amn]*", "aaaamnnnn")); //true
        
        /**
         * x{n} exactly n times 
         * x{n,} at least n times 
         * x{n,y} at least n times but no more than y times
         */
        System.out.println("{n} (Greedy) quantifier occurs exactly {n} times..");
        System.out.println(Pattern.matches("[abc]{3}","a"));//false
        System.out.println(Pattern.matches("[abc]{3}","b"));//false
        System.out.println(Pattern.matches("[abc]{3}","c"));//false
        System.out.println(Pattern.matches("[abc]{3}","aaa"));//true
        System.out.println(Pattern.matches("[abc]{3}","bbb"));//true
        System.out.println(Pattern.matches("[abc]{3}","ccc"));//true
        System.out.println(Pattern.matches("[abc]{3}","z"));//false
        System.out.println(Pattern.matches("[abc]{3}",""));//false
        System.out.println(Pattern.matches("[abc]{3}","zzzz"));//false
        
    }
}
