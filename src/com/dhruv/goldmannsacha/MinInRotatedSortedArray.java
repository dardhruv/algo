package com.dhruv.goldmannsacha;

public class MinInRotatedSortedArray {

    public static void main(String[] args) {
        findMin(new int[]{2,1});
    }

    public static int findMin(int[] nums) {

        if(nums[0] < nums[nums.length-1] || nums.length == 1){
            return nums[0];
        }

        int start = 0;
        int end = nums.length -1;
        int mid;
        while(start < end){
            mid = (start + end)/2;
            if(nums[mid-1] > nums[mid] && nums[mid+1] > nums[mid] ){
                return nums[mid];
            }

            else if(nums[mid] < nums[0]){
                end = mid-1;
            }
            else if(nums[mid] > nums[0]){
                start = mid+1;
            }
        }
        return -1;
    }
}
