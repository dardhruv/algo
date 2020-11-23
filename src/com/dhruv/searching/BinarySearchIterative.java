package com.dhruv.searching;

public class BinarySearchIterative {

    public static void main(String[] args) {

    }

    public static int binarySearch(int[] array,int target){
        int left = 0;
        int right = array.length -1;

        while(left < right){
            int middle = (left + right)/2;
            int potentialMatch = array[middle];
            if(potentialMatch == target)
                return middle;
            else if (target > potentialMatch){
                left = middle+1;
            }
            else if(target < potentialMatch){
                right = middle -1;
            }
        }
        return -1;
    }
}
