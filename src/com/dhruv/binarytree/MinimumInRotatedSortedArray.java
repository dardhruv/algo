package com.dhruv.binarytree;

public class MinimumInRotatedSortedArray {


    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,1,2}));
    }
    public static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        if(nums.length == 1)
            return nums[0];
        if(nums[nums.length-1] > nums[0])
            return nums[0];

        while(right > left){
            int mid = left + (right-left)/2;
            if(nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }
            if(nums[mid-1] < nums[mid]){
                return nums[mid];
            }
            if(nums[mid] > nums[0]){
                left = mid+1;
            }
            if(nums[mid] < nums[0]){
                right = mid-1;
            }
        }
        return -1;
    }
}
