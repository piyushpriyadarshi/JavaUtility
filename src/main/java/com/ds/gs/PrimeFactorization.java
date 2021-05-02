package com.ds.gs;

import java.util.Scanner;

/**
 *
 *
 * 1. You are required to display the prime factorization of a number.
 *     2. Take as input a number n.
 *     3. Print all its prime factors from smallest to largest.
 *
 * Input Format
 * n, an integer
 * Output Format
 * p1  p2  p3  p4.. all prime factors of n
 */


public class PrimeFactorization {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int remainder=number;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if(isPrime(i)){
                while(remainder % i ==0){
                    remainder=remainder/i;
                    System.out.print(i+" ");
                }
            }
        }
        if(remainder!=1){
            System.out.print(remainder);
        }
    }

    public static boolean isPrime(int number){
        boolean isPrime=true;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if(number % i == 0){
                isPrime=false;
            }
        }
       return isPrime;
    }
}
