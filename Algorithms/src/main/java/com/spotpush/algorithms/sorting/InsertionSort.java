package com.spotpush.algorithms.sorting;

import java.util.Arrays;

/**
* Simple, slow, good for small data sets
* @author Stephen Hardy @ spotpush.com
*/

public class InsertionSort {

    @SuppressWarnings({"rawtypes","unchecked"})
    public static void insertionSort(Object[] a,int fromIndex,int toIndex) {
        Object d;
        for (int i = fromIndex+1;i<toIndex;i++) {
            d=a[i];
            int j=i;
            while (j>fromIndex && ((Comparable)a[j-1]).compareTo(d)>0) {
                a[j]=a[j-1];
                j--;
            }
            a[j]=d;
        }
    }
    
    //not sure this is relevant to insertion sort
    public static void insertionSortImproved(Object[]a,int fromIndex, int toIndex) {
        Object d;
        for (int i = fromIndex+1;i<toIndex;i++) { //1,2,3
            d=a[i]; //5,12,10
            int jLeft = fromIndex; //0,0,0
            int jRight = i-1;//0,1,2
            if (((Comparable) a[jRight]).compareTo(d)>0) {
                while(jRight - jLeft >=2) {
                    int jMiddle=(jRight-jLeft)/2+jLeft-1;//0
                    if (((Comparable) a[jMiddle]).compareTo(d)>0) {
                        jRight = jMiddle;
                    } else {
                        jLeft = jMiddle+1;//
                    }
                }
                if (jRight - jLeft == 1) {
                    int jMiddle=jLeft;
                    if (((Comparable) a[jMiddle]).compareTo(d)>0) {
                        jRight = jMiddle;
                    } else {
                        jLeft = jMiddle + 1;
                    }
                }
                int j = i;
                for (j=i;j>jLeft;j--) {
                    a[j]=a[j-1];
                }
                a[j]=d;
            }
        }
    }
        
    public static void main(String[] args) {
    
        Integer[] array = new Integer[] {2,5,12,10,36,11,22,47,1};
        //insertionSort(array,0,array.length);
        //System.out.println("Insertion Sort "+Arrays.toString(array));
        insertionSortImproved(array,0,array.length);
        System.out.println("Improved Insertion Sort "+Arrays.toString(array));
        
                
    }
}
