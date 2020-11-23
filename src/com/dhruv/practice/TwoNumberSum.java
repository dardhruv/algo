package com.dhruv.practice;

import java.util.*;

public class TwoNumberSum {

    public static void main(String[] args) {
     int[] arr =   twoSum(new int[]{3,3},6);
    }

    public static int[] twoSum(int[] nums, int target) {

        int p1 = 0;
        int p2 = nums.length -1;
        Map<Integer, Integer> indicesMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int requiredElement = target-nums[i];
            if(indicesMap.containsKey(requiredElement)){
                return new int[]{indicesMap.get(requiredElement),i};
            }
            indicesMap.put(nums[i],i);
        }
        throw new NoSuchElementException();
    }

}
