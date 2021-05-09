package com.paradigm.timeandspace;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 0, 3, 4, -1, -1, 4, 4, 5, 5, 5, 6, 7, 7, 9, 10 };
        countSort(arr);
    }

    private static void countSort(int[] arr) {
        // generating fMap using Arrays
        int[] fMap = new int[11];
        int[] negativefMap = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                fMap[arr[i]]++;
            } else {
                System.out.println(arr[i]);
                negativefMap[Math.abs(arr[i])]++;
            }
        }
        // starting filling the array
        int i = 0;
        for (int j = 0; j < negativefMap.length; j++) {
            int data = j;
            int frequency = negativefMap[j];
            while (frequency > 0) {
                arr[i] = -data;
                i++;
                frequency--;
            }
        }
        for (int j = 0; j < fMap.length; j++) {
            int data = j;
            int frequency = fMap[j];
            while (frequency > 0) {
                arr[i] = data;
                i++;
                frequency--;
            }
        }
        System.out.println(Arrays.toString(negativefMap));
        System.out.println(Arrays.toString(arr));
    }

}
