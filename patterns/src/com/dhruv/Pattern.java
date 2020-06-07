package com.dhruv;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1;
        int nsp = n-1;
        int nst = 1;
        int row = 1;
        while(row <= n){
            for(int i=0; i<=nsp; i++){
                System.out.print(" "+"\t");
            }
            for(int cst = 1; cst <= nst; cst++){
                System.out.print(val+"\t");
                val++;
            }
            nsp --;
            nst += 2;
            row++;
            System.out.println();
        }
    }
}
