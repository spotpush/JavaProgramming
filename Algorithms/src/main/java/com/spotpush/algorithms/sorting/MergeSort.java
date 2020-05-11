package com.spotpush.algorithms.sorting;

import java.util.Arrays;

/**
* 
* @author Stephen Hardy @ spotpush.com
*/

public class MergeSort {

    public static Comparable[] mergeSort(Comparable[] list) {
        //If list is empty exit method
        if (list.length<=1) {
            return list;
        }
        
        //Step 1 - Split Array into half
        Comparable[] first = new Comparable[list.length/2];
        Comparable[] second = new Comparable[list.length-first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list,first.length,second,0,second.length);
        
        //Step 2 - Sort each half recursively
        mergeSort(first);
        mergeSort(second);
        
        //Step 3 - Merge both halves together overwriting the original array
        merge(first,second,list);
        return list;
    }
    
    public static void merge(Comparable[] first,Comparable[] second, 
            Comparable[] result) {
        
        int iFirst=0;
        int iSecond=0;
        int iMerged=0;
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst].compareTo(second[iSecond])<0) {
                result[iMerged]=first[iFirst];
                iFirst++;
            } else {
                result[iMerged]=second[iSecond];
                iSecond++;
            }
             iMerged++;
        }
        System.arraycopy(first, iFirst, result, iMerged, first.length-iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length-iSecond);
    }
    
    
    public static void main(String[] args) {
    
        Integer[] array = {6,2,8,4,2,7,10,25,18};
        System.out.println("Before Merge Sort "+Arrays.toString(array));
        mergeSort(array);
        System.out.println("After Merge Sort "+Arrays.toString(array));
    }
}
