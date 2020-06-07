package com.dhruv.string;

import java.util.Scanner;

public class CharacterType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = str.toLowerCase();
        String str2 = str.toUpperCase();
        if(str1.charAt(0) == str2.charAt(0)){
            System.out.print("I");
        }else if(str.charAt(0) == str1.charAt(0)){
            System.out.print("L");
        }else{
            System.out.print("U");
        }
    }
}
