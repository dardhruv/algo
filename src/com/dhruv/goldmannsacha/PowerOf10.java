package com.dhruv.goldmannsacha;

public class PowerOf10 {
    public static void main(String[] args) {

    }

    public static boolean isPowerOf10(int input){
        while(input > 9 && input % 10 == 0){
            input /= 10;
        }
        return input == 1;
    }
}
