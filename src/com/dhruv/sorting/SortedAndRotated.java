package com.dhruv.sorting;

// find the minimum element in sorted and rotated array
public class SortedAndRotated {


    public static void main(String[] args) {

    }

    public static int shiftedBinarySearch(int[] array,int target){
        return shiftedBinarySearchHelper(array,0,array.length,target);
    }

    public static int shiftedBinarySearchHelper(int[] array,int left,int right,int target){
        if(left > right) {
            return -1;
        }
        int middle = (left+right)/2;
        int potentialMatch = array[middle];
        int leftNum = array[left];
        int rightNum = array[right];
        if(target == potentialMatch){
            return middle;
        }
        else if(leftNum < potentialMatch ){
            if(target >= leftNum && target < potentialMatch){
                return shiftedBinarySearchHelper(array,left,middle-1,target);
            }else{
                return shiftedBinarySearchHelper(array,middle+1,right,target);
            }
        }
        else{
            if(target > potentialMatch && target < rightNum){
                return shiftedBinarySearchHelper(array,middle+1,right,target);
            }else{
                return shiftedBinarySearchHelper(array,left,middle-1,target);
            }
        }
    }

}
