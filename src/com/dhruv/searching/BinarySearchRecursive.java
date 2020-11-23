package com.dhruv.searching;

public class BinarySearchRecursive {

    public static void main(String[] args) {

    }

    public static int binarySearch(int[] array,int target){
        return binarySearchHelper(array,array[0],array[array.length -1],target);
    }

    public static int binarySearchHelper(int[] array,int left,int right,int target){
        if(left > right) return -1;
        int middle = (left+right)/2;

        int potentialMatch = array[middle];
        if(potentialMatch == target) return middle;
        else if(target > middle){
            return binarySearchHelper(array,middle+1,right,target);
        }
        else if (target < middle){
            return binarySearchHelper(array,left,middle-1,target);
        }
        return -1;
    }
}
