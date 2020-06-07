package com.dhruv;

import java.util.Scanner;

public class Pattern7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nst = n;
        int r = 0;
        while(row <= n){
            int csp = 1;
            while(csp <= n){
                if(csp >= (((n+1)/2)-r) && csp <= (((n+1)/2)+r)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                csp++;
            }
            if(row < (n+1)/2){
                r++;
            }else{
                r--;
            }
            System.out.print("\n");
            row++;
        }
    }
}
