package com.dhruv.goldmannsacha;

public class SecondAmallest {
    public static void main(String[] args) {
        print2Smallest(new int[]{1,2,4,5,67,8,9,34,2233});
    }
    static void print2Smallest(int[] arr){
        int first;
        int second;
        int arr_size = arr.length;

        if(arr_size < 2){
            return ;
        }

        first = second = Integer.MAX_VALUE;

        for(int i=0; i<arr_size;i++){
            if(arr[i] < first){
                second = first;
                first = arr[i];
            }else if(arr[i] < second && arr[i] != first){
                second = arr[i];
            }
        }
        System.out.println("second minimum element in the array is"+second);
    }
}
