package com.dhruv;

import java.util.Scanner;

public class Pattern32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int val = 1;
        int nsp = 1;
        while(row <= (2*n-1)){
            for(int i = 1; i <= nsp; i++){
                if(i % 2 == 0){
                    System.out.print("*"+"\t");
                }else{
                    System.out.print(val+"\t");
                }
            }
            if(row < n){
                nsp += 2;
                val += 1;
            }else{
                nsp -= 2;
                val -= 1;
            }
            row++;
            System.out.print("\n");
        }
    }
}
