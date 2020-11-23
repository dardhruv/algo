package com.dhruv.goldmannsacha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumSum {
    public static void main(String[] args) {

        System.out.println(threeNumberSum(new int[]{12,3,1,2,-6,5,-8,6},0));
    }
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        List<Integer[]> result = new ArrayList<>();
        int currentSum = 0;
        int leftPtr;
        int rightPtr;
        for(int i=0; i<array.length; i++){
            leftPtr = i+1;
            rightPtr = array.length - 1;

            while(leftPtr < rightPtr){
                int currentNum = array[i]+array[leftPtr]+array[rightPtr];
                if(currentNum < targetSum){
                    leftPtr++;
                }
                else if(currentNum > targetSum){
                    rightPtr --;
                }else{
                    result.add(new Integer[]{array[i],array[leftPtr],array[rightPtr]});
                    leftPtr ++;
                    rightPtr --;
                }
            }
        }
        return result;
    }
}
