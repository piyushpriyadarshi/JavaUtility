package com.ds.pattern;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=0;
        int start=1;

        for (int i = 0; i < n; i++) {

            //space print
            for (int j = 0; j < space; j++) {
                System.out.print("\t");
            }

            //star print
            for (int j = 0; j < start; j++) {
                System.out.print("*");
            }
            System.out.println();

            //count management
            space++;
        }
    }
}
