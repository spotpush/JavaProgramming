package com.spotpush.algorithms.sorting;

import java.util.Arrays;

/**
* Selection sort is an in place comparison sorting algorithm
* Not advisable for large data sets
* Steps
* 1 - Find minimum element in the list
* 2 - Swap minimum element with current element
* 3 - Repeat the whole process until array is fully stored
* @author Stephen Hardy @ spotpush.com
*/

public class SelectionSort {
    
    /**
     * Complexity
     * Best Case O(N^2)
     * Average Case: O(N^2)
     * Worst Case: O(N^2)
     * @param arr
     * @return 
     */
    public static int[] selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            int index = i;
            for(int j=i+1;j<arr.length;j++)
                if (arr[j]<arr[index])
                    index=j;
            int smallerNumber=arr[index];
            arr[index]=arr[i];
            arr[i]=smallerNumber;
        }
        return arr;
    }
    public static void main(String[] args) {
    
        int[] arr = {40,10,-30,45,39,32};
        System.out.println("Befor sorting: "+Arrays.toString(arr));
        arr = selectionSort(arr);
        System.out.println("After Sotring: "+Arrays.toString(arr));
        
    }
}
