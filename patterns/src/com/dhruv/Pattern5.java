package com.dhruv;

import java.util.Scanner;

public class Pattern5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = n;
        int nsp = 0;
        while(row <= n){
            int csp = 1;
            while(csp <= nsp ){
                System.out.print(" ");
                csp++;
            }
            int cst = 1;
            while(cst <= nst){
                System.out.print("*");
                cst++;
            }
            nsp++;
            nst--;
            row++;
            System.out.println();
        }
    }
}
