package com.spotpush.algorithms.sorting;

import java.util.Arrays;



/**
* QuickSort or partition-exchange sort is a sorting algorithm which is using
* divide and conquer algorithm
* Steps
* 1 - Choose a Pivot (generally the mid)
* 2 - Initialise two index variables left=0, right=arr.length-1
* 3 - Increment left variable until you get an element higher than the pivot
* 3 - Decrement right variable until you get element lesser than pivot
* 4 - swap arr[left] and arr[right]
* 5 - Recursively sort sublists less than pivot and greater than pivot
* @author Stephen Hardy @ spotpush.com
*/

public class QuickSort {

    private static int array[];
    
    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        array = arr;
        quickSort(0,array.length-1);
    } 
    
    private static void quickSort(int left, int right) {
        int i = left;
        int j = right;
        int pivot = array[left+(right-left)/2];
        while(i<=j) {
            while (array[i]< pivot) {
                i++;
            } while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchange(i,j);
                i++;
                j--;
                       
            }
        }
        if(left < j)
            quickSort(left, j);
        if(i<right)
            quickSort(i,right);
    }
    
    private static void exchange(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    public static void main(String[] args) {
    
        int[] input={32,21,45,64,55,34,11,8,3,5,1};
        System.out.println("Before QuickSort: "+Arrays.toString(input));
        sort(input);
        System.out.println("After QuickSort: "+Arrays.toString(array));
        
    }
}
