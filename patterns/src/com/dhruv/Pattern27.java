package com.dhruv;

import java.util.Scanner;

public class Pattern27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1;
        int nst = 1;
        int row = 1;
        while(row <= n){
            int val = 1;
            for(int i = 1; i <= nsp; i++){
                System.out.print(" ");
            }
            for(int i = 1; i <= nst; i++){
                System.out.print(val);
                if(i < row){
                    val++;
                }else{
                    val--;
                }
            }
            nsp --;
            nst += 2;
            row++;
            System.out.print("\n");
        }
    }
}
