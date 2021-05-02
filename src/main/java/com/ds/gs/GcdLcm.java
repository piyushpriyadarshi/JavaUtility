package com.ds.gs;

/**
 *
 *
 * 1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
 * 2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
 * 3. Take input "num1" and "num2" as the two numbers.
 * 4. Print their GCD and LCM.
 *
 * Input Format
 *
 * num1
 * num2
 * .. the numbers whose GCD and LCM we have to find.
 *
 * Output Format
 *
 * a
 * b
 * .. where 'a' and 'b' are the GCD and LCM respectively.
 *
 */

import java.util.*;
import java.io.*;
public class GcdLcm {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num1=Integer.parseInt(br.readLine());
        int num2=Integer.parseInt(br.readLine());

        int divisor=num1;
        int dividend=num2;

        while(divisor!=0){
            int remainder=dividend%divisor;
            dividend=divisor;
            divisor=remainder;
        }
        int gcd=dividend;
        int lcm=(num1*num2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);

    }
}
