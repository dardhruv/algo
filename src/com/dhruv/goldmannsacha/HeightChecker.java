package com.dhruv.goldmannsacha;

import java.util.Arrays;

public class HeightChecker {

    public static void main(String[] args) {
        int[] heights = new int[]{5,1,2,3,4};
        System.out.println(heightChecker(heights));
    }

    public static  int heightChecker(int[] heights){
        int[] copy = new int[heights.length];
        System.arraycopy(heights,0,copy,0,copy.length);
        Arrays.sort(copy);
        int result = 0;
        for(int i=0; i<copy.length; i++){
            if(heights[i] != copy[i]){
                result ++;
            }
        }
        return result;
    }
}
