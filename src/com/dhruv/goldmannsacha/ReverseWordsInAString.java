package com.dhruv.goldmannsacha;


import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordsInAString {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String[] input = new String[T];
        for(int i=0; i<T;i++){
            input[i] = scanner.next();
        }
        for(int j=0; j<input.length;j++){
            System.out.println(reverseString(input[j]));
        }
    }

    public static String reverseString(String original){
        String reversed = reverse(original);
        String[] str = reversed.split("\\.");
        for(int i=0; i<str.length; i++){
            str[i] = reverse(str[i]);
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while( i < str.length){
            sb = sb.append(str[i]);
            if(i < str.length -1 && i >= 0){
                sb.append(".");
            }
            i++;
        }
        return sb.toString();
    }

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        int i = s.length()-1;
        while(i >= 0){
            sb.append(s.charAt(i));
            i--;
        }
        return sb.toString();
    }
}
