package com.spotpush.javacoding;
/**
 * Create a function that takes a string and returns the number (count) of vowels 
 * contained within it.
 * countVowels("Celebration") ➞ 5
 * countVowels("Palm") ➞ 1
 * countVowels("Prediction") ➞ 4
 * All test cases are one word with only letters
 * @author Stephen Hardy @ spotpush.com
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HowManyVowles {

    public static void main(String[] args) {
        int count = 0;
        String str = "abcdefghijklmnopqrstuvwxyz";
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(str);
        while (m.find()) {
            count++;
            System.out.print(m.group()+", ");
        } 
        System.out.println(count);
    }
}