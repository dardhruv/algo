package com.dhruv.goldmannsacha;

public class FindMissingNumber {

    // 76,77,79,80,81
    public static void main(String[] args) {
        int[] arr = new int[]{76,77,79,80,81};
        findMissing(arr,5);
    }

    public static int findMissing(int arr[],int n){
        int l = 0,h = n-1;
        int mid;

        while(h > l){

            mid = (h+l)/2;
            if(arr[mid] -mid == arr[0]){
                if(arr[mid+1] -arr[mid] > 1){
                    return arr[mid] +1;
                }else{
                    l = mid+1;
                }
            }else{
                if(arr[mid] - arr[mid-1] > 1){
                    return arr[mid] -1;
                }
                else{
                    h = mid -1;
                }
            }
        }
        return -1;
    }
}
