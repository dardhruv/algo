package com.dhruv;

import java.util.Scanner;

public class Pattern6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = ((n+1)/2)-1;
        int row = 1;
        while(row <= ((n/2)+1)){
            int cst = 1;
            while(cst <= nst){
                System.out.print("*");
                cst++;
            }
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            row++;
            nst++;
            nsp--;
            System.out.print("\n");
        }
        nst = ((n+1)/2)-1;
        nsp = 1;
        while(row <= n){
            int cst = 1;
            while(cst <= nst){
                System.out.print("*");
                cst++;
            }
            int csp = 1;
            while(csp <= nsp){
                System.out.print(" ");
                csp++;
            }
            row++;
            nst--;
            nsp++;
            System.out.print("\n");
        }
    }
}
