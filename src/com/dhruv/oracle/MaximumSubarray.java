package com.dhruv.oracle;

//divide and conquer
public class MaximumSubarray {

    public static void main(String[] args) {
        int[] intArray = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarray(intArray));
    }

    public static int maxSubarray(int[] nums){
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];
        for(int i=1; i<nums.length; i++){
            maxEndingHere = Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar = Math.max(maxEndingHere,maxSoFar);
        }
        return maxSoFar;
    }
}
