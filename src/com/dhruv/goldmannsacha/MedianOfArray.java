package com.dhruv.goldmannsacha;

import java.util.NoSuchElementException;

public class MedianOfArray {

    public static void main(String[] args) {
        System.out.println(findMedianSortedArray(new int[]{1,3,8,9,15},new int[]{7,11,18,19,21,25}));
    }
    public static double findMedianSortedArray(int input1[],int input2[]) {
        int x = input1.length;
        int y = input2.length;

        if(x > y){
            findMedianSortedArray(input2,input1);
        }

        int low = 0;
        int high = x;

        while(low <= high){
            int partitionX = (low + high)/2;
            int partitionY = (x+y+1)/2 -partitionX;

            int maxLeftX = partitionX == 0 ? Integer.MIN_VALUE : input1[partitionX - 1];
            int minRightX = partitionX == x ? Integer.MAX_VALUE : input1[partitionX];

            int maxLeftY = partitionY == 0 ? Integer.MIN_VALUE : input2[partitionY-1];
            int minRightY = partitionY == y ? Integer.MAX_VALUE : input2[partitionY];

            if(maxLeftX <= minRightY && maxLeftY <= minRightX){
                if((x+y)%2 == 0){
                    return (double)(Math.max(maxLeftX,maxLeftY) + Math.min(minRightX,minRightY))/2;
                }else{
                    return Math.max(maxLeftX,maxLeftY);
                }
            }
            else if (maxLeftX < minRightY){
                high = partitionX-1;
            }
            else{
                high = partitionX+1;
            }
        }
        throw new IllegalArgumentException();
    }

}
