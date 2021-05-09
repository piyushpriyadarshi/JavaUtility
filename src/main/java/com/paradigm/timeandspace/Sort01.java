package com.paradigm.timeandspace;

import java.util.Scanner;

public class Sort01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        sort01Partition(arr);
        print(arr);
    }

    private static void sort01(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        for (int i = 0; i < arr.length && low < high; i++) {
            if (arr[i] == 0) {
                swap(arr, low, i);
                low++;
            }
            if (arr[i] == 1) {
                swap(arr, high, i);
                high--;
            }

        }
    }

    private static void sort01Partition(int[] arr) {
        int j = 0;
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i] == 1) {
                i++;
            }
            if (arr[i] == 0) {
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

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
