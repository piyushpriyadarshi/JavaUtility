package com.paradigm.recursion;

public class PrintDecreasing   {

    public static void main(String[] args) {
        printDecreasing(10);
    }

    public static void printDecreasing(int number) {
        if (number == 0) {
            return;
        }
        System.out.println(number);
        printDecreasing(number - 1);
    }
}