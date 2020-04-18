/**
* Create a function that replaces all the vowels in a string with a specified character.
* replaceVowels("the aardvark", '#') ➞ "th# ##rdv#rk"
* replaceVowels("minnie mouse", '?') ➞ "m?nn?? m??s?"
* replaceVowels("shakespeare", '*') ➞ "sh*k*sp**r*"
* 
*/
/** @author Stephen Hardy @ spotpush.com  */
package com.spotpush.javacoding;

/*Imports*/

public class VowelReplacer 
{
    public static void main(String[] args) 
    {
        String str = "This is Java Programming";
        System.out.println(str.replaceAll("[aeio]", "#"));
    }
}
