package com.ds.math;

public class MathUtil {
    public int noOfDigits(int n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        MathUtil mathUtil=new MathUtil();
        System.out.println(mathUtil.noOfDigits(123));
    }
}
