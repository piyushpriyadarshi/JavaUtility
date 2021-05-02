// package com.paradigm.timeandspace;

import java.util.Arrays;

public class Tns {
    public static void main(String[] args) {
        linearSearchDriverCode();
    }

    private static void linearSearchDriverCode() {
        int[] arr = { 1, 20, 3, 4, 5, 6, 100 };
        System.out.println(Arrays.toString(arr));
        int index = linearSearch(arr, 100);
        System.out.println("Element Found at Index \t" + index);
    }

    public static int linearSearch(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return i;
            }
        }
        return -1;
    }

    

}
