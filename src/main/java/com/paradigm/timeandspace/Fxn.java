package com.paradigm.timeandspace;

import java.util.Arrays;

/* 
 @author Piyush Priyadarshi
 createdAt 04/05/2021
*/
public class Fxn {
    public static void main(String[] args) {
        System.out.println(fxn(2, 5));
        int[] arr = { 1, 2, 3, 4, 5, 100 };
        Arrays.sort(arr);

    }

    public static int fxn(int x, int n) {
        int power = 1;
        int result = 0;
        for (int i = n; i > 0; i--) {
            power *= x;
            result += i * power;
        }
        return result;

    }
}