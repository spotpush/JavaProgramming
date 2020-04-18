package com.spotpush.javacoding;
/**
 * Create a function that takes an array as an argument and returns true or 
 * false depending on whether the average of all elements in the array is a 
 * whole number or not.
 * isAvgWhole([1, 3]) ➞ true
 * isAvgWhole([1, 2, 3, 4]) ➞ false
 * isAvgWhole([1, 5, 6]) ➞ true
 * isAvgWhole([1, 1, 1]) ➞ true
 * isAvgWhole([9, 2, 2, 5]) ➞ false
 * 
 * @author Stephen Hardy @ spotpush.com
*/
public class AverageWholeNumber {

    public static void main(String[] args) {
        int[] numArray2 = {1,2,3,4};
        int sum = 0;
        int avg = numArray2.length;
        for (int i=0;i<numArray2.length;i++) {
            sum += numArray2[i];
        }
        double average = (double) sum / avg;
        System.out.println(average);
        if (average % 1 == 0) {
            System.out.println("True");
        } else 
        System.out.println("False");
        
    }
}
