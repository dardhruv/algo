package com.dhruv;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int n = 1;
        while(n <= rows){
            int l = 1;
            while(l <= columns){
                System.out.print("*");
                l++;
            }
            System.out.print("\n");
            n++;
        }
    }
}
