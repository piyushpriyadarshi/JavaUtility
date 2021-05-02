package com.paradigm.recursion;

public class PrintIncreasing {
    public static void main(String[] args) {
        printIncreasing(10);
    }

    public static void printIncreasing(int number) {
        if (number == 0) {
            return;
        }
        printIncreasing(number - 1);
        System.out.println(number);
    }

}
