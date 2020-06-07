package com.dhruv;

import java.util.Scanner;

public class Pattern8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int nsp = n/2;
        int nst = 1;
        while(row <= n){
            for(int i = 1; i <= nsp; i++){
                System.out.print(" ");
            }
            for(int i = 1; i <= nst; i++){
                System.out.print("*");
            }
            if(row <= (n/2)){
                nsp -= 1;
                nst += 2;
            }else{
                nsp += 1;
                nst -= 2;
            }
            row++;
            System.out.println("\n");
        }
    }
}
