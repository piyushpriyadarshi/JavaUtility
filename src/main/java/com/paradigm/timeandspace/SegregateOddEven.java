package com.paradigm.timeandspace;

import java.util.Arrays;

public class SegregateOddEven {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 6, 9, 3, 8, 10, 11, 14, 16, 13, 20 };
        segregateOddEven(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void segregateOddEven(int[] arr) {
        int j = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] % 2 == 0) {
                i++;
            } else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping index " + i + " and index " + j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
