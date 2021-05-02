package com.ds.pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for(int j=1;j<=i;j++){
                if(j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print("*\t");
                }

            }
            System.out.println();
        }
    }
}
