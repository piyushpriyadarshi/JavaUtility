package com.paradigm.recursion;

public class PrintDecreasingIncreasing {

    public static void main(String[] args) {

    }

    public static void printDecreasingIncreasing(int number) {
        if (number == 0) {
            return;
        }
        printDecreasingIncreasing(number - 1);
        System.out.println(number);
    }

}
