package com.paradigm.timeandspace;

import java.util.Arrays;

/* 
 @author Piyush Priyadarshi
 createdAt 04/05/2021
*/
public class Sort012 {
    public static void main(String[] args) {

        int[] arr = { 2, 1, 0 };
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort012(int[] arr) {
        int j = 0;
        int i = 0;
        int k = arr.length - 1;
        while (i <= k) {
            if (arr[i] == 1) {
                i++;
            } else if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                swap(arr, i, k);
                k--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping index " + i + " and index " + j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}