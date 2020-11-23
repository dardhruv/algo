package com.dhruv.goldmannsacha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourNumSum {

    public static void main(String[] args) {
        int[] arr = new int[]{7,6,4,-1,1,2};
        fourNumberSum(arr,16);

    }
    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<>();
        Map<Integer,List<Integer[]>> pairMap = new HashMap<>();
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j< array.length; j++){
                int requiredSum = targetSum - (array[i] + array[j]);
                if(pairMap.containsKey(requiredSum)){
                    //result.add(new Integer[]{pairMap.get(requiredSum)[0],pairMap.get(requiredSum)[1],array[i],array[j]})
                    List<Integer[]> requiredPairs = pairMap.get(requiredSum);
                    for(Integer[] arr:requiredPairs){
                        result.add(new Integer[]{arr[0],arr[1],array[i],array[j]});
                    }
                }
            }
            int k=i-1;
            while(k < i && k >= 0 ){
                int keyToAdd = array[k] + array[i];
                if(pairMap.containsKey(keyToAdd)){
                    List<Integer[]> pairList = pairMap.get(keyToAdd);
                    pairList.add(new Integer[]{array[k],array[i]});
                    pairMap.put(keyToAdd,pairList);
                }else{
                    List<Integer[]> pairList = new ArrayList<>();
                    pairList.add(new Integer[]{array[k],array[i]});
                    pairMap.put(keyToAdd,pairList);
                }
                k--;
            }
        }
        return result;
    }
}
