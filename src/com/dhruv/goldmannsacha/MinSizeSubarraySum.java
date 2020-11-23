package com.dhruv.goldmannsacha;

public class MinSizeSubarraySum {


    public static void main(String[] args) {
        int[] nums = new int[]{84,-37,32,40,95};
        new MinSizeSubarraySum().minSubArraySum(167,nums);
    }
    public int minSubArraySum(int s,int[] nums){
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
            while(sum >= s){
                ans = Math.min(ans,i+1-left);
                sum -= nums[left];
                left++;
            }
        }
        return (ans != Integer.MAX_VALUE) ? ans:0;
    }
}
