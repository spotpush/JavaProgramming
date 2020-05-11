package com.spotpush.algorithms.sorting;

import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




/**
* Bubble Sort Implementation
* @author Stephen Hardy @ spotpush.com
*/

public class BubbleSort {
    
    private static final Logger LOGGER = LogManager.getLogger(BubbleSort.class);
    
    
    public static int[] bubbleSort(int arr[]) {
        for (int i=0;i<arr.length;i++) {
            LOGGER.info(Arrays.toString(arr));
            for (int j=0;j<arr.length-1;j++) {
                LOGGER.info("i: "+i+" "+arr[i]+", j: "+j+" "+arr[j]);
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
            }
            System.out.print("Iteration "+(i+1)+": ");
            printArray(arr);
        }
        return arr;
    }
    
    public static void printArray(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" "); 
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
    
        int[] arr = {34, 45, 11, 76, 2, 1, 100};
        System.out.println("");
        bubbleSort(arr);
    }
}
