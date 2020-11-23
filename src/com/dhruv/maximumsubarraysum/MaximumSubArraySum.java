package com.dhruv.maximumsubarraysum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MaximumSubArraySum {

    static int[] arr = new int[]{3,5,-9,1,3,-2,3,4,7,2,-9,6,3,1,-5,4};
    static ArrayList<Integer> result = new ArrayList<>();
    public static void main(String[] args) {
        for(int i=0; i<arr.length; i++) {
            for(int k=i; k < arr.length; k++) {
                int sum = 0;
                if(i == 3 && k == 13){
                    System.out.println("55");
                }
                for (int j = i; j <= k; j++) {
                    sum += arr[j];
                }
                result.add(sum);
            }
        }
        result.sort((a,b) -> a < b ? 1:-1);
        System.out.println(result.get(0));
    }

}
