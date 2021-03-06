package com.dhruv.goldmannsacha;

import java.util.Arrays;
import java.util.HashMap;

public class KDiffferentPairs {


    public int findPairs(int[] nums,int k){
        Arrays.sort(nums);

        int left = 0;
        int right = 1;
        int result = 0;

        while(left < nums.length && right < nums.length){
            if(left == right || nums[right] -nums[left] < k){
                right++;
            }
            else if(nums[right] - nums[left] > k){
                left++;
            }
            else{
                left++;
                result++;
                while(left < nums.length && nums[left] == nums[left-1]){
                    left++;
                }
            }
        }
        return result;
    }
}
