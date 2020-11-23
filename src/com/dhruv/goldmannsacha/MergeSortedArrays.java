package com.dhruv.goldmannsacha;

public class MergeSortedArrays {


    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0},3,new int[]{-1,5,6},3);
    }

//    public void merge(int[] nums1,int m,int[] nums2,int n){
//
//        int[] nums1_copy = new int[nums1.length];
//
//        System.arraycopy(nums1,0,nums1_copy,0,nums1.length);
//
//        // pointer for nums1
//        int p1 = 0;
//        // pointer for nums2
//        int p2 = 0;
//        // pointer for nums1_copy
//        int p = 0;
//
//        while((p1 < m) && (p2 < n)){
//            nums1[p++] = nums1_copy[p1] < nums2[p2] ? nums1_copy[p1++] : nums2[p2++];
//        }
//
//        if(p1 < m)
//        System.arraycopy(nums1_copy,p1,nums1,p1+p2,m+n-p1-p2);
//        if(p2 < n)
//        System.arraycopy(nums2,p2,nums1,p1+p2,m+n-p1-p2);
//
//    }


    public static void merge(int[] nums1,int m,int[] nums2,int n){
        int p1 = m-1;
        int p2 = n-1;
        int p = nums1.length-1;

        while(p1 >=0 && p2 >= 0){
            nums1[p--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
        }
        System.arraycopy(nums1,0,nums2,0,p+1);
    }
}
