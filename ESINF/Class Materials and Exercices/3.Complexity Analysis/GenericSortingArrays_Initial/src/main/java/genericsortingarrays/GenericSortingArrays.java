/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericsortingarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author DEI-ISEP
 */


public class GenericSortingArrays {

    /**
     * Swaps two vector positions                  O(1)
     */
    public static <E> void swap(E[] v, int i, int j) {

        E temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }

    //  printArray
    public static <E> void printArray(E[] v) {
        for (E element : v)
            System.out.println(", " + element);
    }

    /**
     * Selection Sort Algorithm
     */
    public static <E extends Comparable<E>> void selectionSort(E[] v) {

        for (int i = 0; i < v.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j].compareTo(v[min]) < 0) {
                    min = j;
                }
            }
            swap(v, i, min);
        }
    }

    /**
     * Bubble Sort Algorithm
     *
     * @param v
     */
    public static <E extends Comparable<E>> void bubbleSort(E[] v) {
        for (int i = 0; i < v.length - 1; i++)
            for (int j = v.length - 1; j > i; j--)
                if (v[j - 1].compareTo(v[j]) > 0)
                    swap(v, j, j - 1);
    }

    /**
     *  Optimized Bubble Sort Algorithm
     *
     * @param v
     */
    public static <E extends Comparable<E>> void optimizedBubbleSort(E[] v) {
        boolean flag = true;
        for (int i = 0; (i < v.length-1 && flag); i++) {
            flag = false;
            for (int j = v.length-1; j > i; j--)
                if (v[j-1].compareTo(v[j]) > 0 ) {
                    swap(v, j, j-1);
                    flag = true;
            }
        }
    }

    /**
     * insertionSort Algorithm
     */
    public static <E extends Comparable<E>> void insertionSort(E[] v) {
       for (int i = 1; i < v.length; i++) {
           int j = i;
           E x = v[i];
           while (j > 0 && x.compareTo(v[j -1]) < 0) {
               v[j] = v[j-1];
               j--;
           }
           v[j] = x;
       }
    }

    /**
     * Mergesort Algorithm
     */
    private static <E extends Comparable<E>> void merge(E[] S1, E[] S2, E[] S) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i< S1.length && j < S2.length) {
            if (S1[i].compareTo(S2[j]) < 0) {
                S[k] = S1[i];
                i++;
            } else {
                S[k] = S2[j];
                j++;
            }
            k++;
        }
        while (i< S1.length) {
            S[k] = S1[i];
            i++;
            k++;
        }
        while (j < S2.length) {
            S[k] = S2[j];
            j++;
            k++;
        }
    }

    public static <E extends Comparable<E>> void mergeSort(E[] S) {
        // base case
        if (S.length == 0 || S.length == 1) return;

        if (S.length >= 2) {
            int mid = (S.length / 2);
            E[] S1 = Arrays.copyOfRange(S, 0, mid);
            E[] S2 = Arrays.copyOfRange(S, mid, S.length);
            mergeSort(S1);
            mergeSort(S2);
            merge(S1, S2, S);
        }
    }

    /**
     * Quicksort Algorithm
     */
    public static <E extends Comparable<E>> void quickSort(E v[]) {
        quickSort(v, 0, v.length);
    }

    private static <E extends Comparable<E>> void quickSort(E v[], int left, int right) {
        int pivot = v.length/2;
        int i = left;
        int j = right;
        while (i <= j){
            while (v[i].compareTo(v[pivot]) < 0) {
                i++;
            }

            while (v[i].compareTo(v[pivot]) > 0)
                j--;
            if (i <= j) {
                swap(v, i, j);
                i++;
                j--;
            }
        }
        if (left < j)
            quickSort(v,left,j);
        if (right > i)
            quickSort(v,i,right);
    }
}
