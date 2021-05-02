package com.ds.array;

public class Arrays {

    public static void reverse(int[] arr){
        int low=0;
        int high=arr.length-1;
        while (low<high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
