package com.dhruv.goldmannsacha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class isValidSubsequence {

    public static void main(String[] args) {
        System.out.println(isValidSubsequence(Arrays.asList(5,1,22,25,6,-1,8,10),Arrays.asList(1,6,-1,10)));
    }

    public static boolean isValidSubsequence(List<Integer> array,List<Integer> sequence){

        int arrIdx = 0;
        int seIdx = 0;
        while(arrIdx < array.size() && seIdx < sequence.size()){
            if(array.get(arrIdx) == sequence.get(seIdx)){
                seIdx++;
            }
            arrIdx++;
        }
        return seIdx == sequence.size();
    }
}
