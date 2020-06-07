package com.dhruv.string;

import java.util.Scanner;

public class AsciiDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.length() > 1000 || str.length() < 2){
            throw new RuntimeException();
        }
        System.out.print(str.charAt(0));
        for(int i = 1; i < str.length(); i++){
            int diff = str.charAt(i) - str.charAt(i-1);
            System.out.print(diff);
            System.out.print(str.charAt(i));
        }
    }
}
