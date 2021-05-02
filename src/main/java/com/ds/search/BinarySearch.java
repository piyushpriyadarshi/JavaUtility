package com.ds.search;

public class BinarySearch {

    public static int binarySearch(int[] arr,int low,int high,int data){
        if(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==data){
                return mid;
            }
            if(arr[mid] >data){
                return binarySearch(arr,low,mid-1,data);
            }
            return binarySearch(arr,mid+1,high,data);

        }
        return -1;
    }
    public static int binarySearch(int[] arr,int data){
        return binarySearch(arr,0,arr.length-1,data);
    }

    public static int leftMostindex(int[] arr,int data){
        return leftMostindex(arr,0,arr.length-1,data);
    }

    public static int leftMostindex(int[] arr,int low,int high,int data){
        if(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==data && (mid==0 || arr[mid-1]!=data)){
                return mid;
            }
            if(arr[mid] == data || arr[mid] > data){
                return leftMostindex(arr,low,mid-1,data);
            }
            return leftMostindex(arr,mid+1,high,data);

        }
        return -1;
    }

}
