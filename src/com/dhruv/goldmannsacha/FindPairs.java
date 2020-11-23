package com.dhruv.goldmannsacha;

import java.util.HashMap;
import java.util.Map;

public class FindPairs {

    public int findPairs(int[] nums,int k){
        int result = 0;

        HashMap<Integer,Integer> counter = new HashMap<>();
        for(int n:nums){
            counter.put(n,counter.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:counter.entrySet()){
            int x = entry.getKey();
            int val = entry.getValue();

        }
    }
}
