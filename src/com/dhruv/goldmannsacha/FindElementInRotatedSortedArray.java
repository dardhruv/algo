package com.dhruv.goldmannsacha;

public class FindElementInRotatedSortedArray {
    public static void main(String[] args) {
        search(new int[]{4,5,6,7,0,1,2},0);
    }
    public static int search(int[] nums, int target) {
        if(nums.length == 0 || nums == null)
            return -1;

        int start = 0;
        int end = nums.length-1;
        int mid = 0;
        while(start <= end){
            mid = (start + end)/2;
            int potentialMatch = nums[mid];
            if(target == potentialMatch)
                return mid;
            if(nums[0] <= potentialMatch ){
                if(target < potentialMatch && target >= nums[0] ){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target > potentialMatch && target <= nums[nums.length-1] ){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
