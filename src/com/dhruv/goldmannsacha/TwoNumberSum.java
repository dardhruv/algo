package com.dhruv.goldmannsacha;

import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {

    public static void main(String[] args) {

    }

    public static int[] twoNumberSum(int[] array, int targetSum){
        Map<Integer,Integer> hMap = new HashMap<>();
        for(int i=0; i<array.length; i++){
            hMap.put(array[i],i);
        }
        int requiredSum = 0;
        for(int i=0; i<array.length;i++){
            requiredSum = targetSum - hMap.get(array[i]);
            if(hMap.containsKey(requiredSum))
                return new int[]{hMap.get(requiredSum),hMap.get(array[i])};

        }
        return new int[]{};
    }
}
