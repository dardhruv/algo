package com.dhruv.monotonic;

public class Monotonic {


    public static void main(String[] args) {
        int[] array = new int[]{0,1,1,1,1,1,2,3,4,5,6,7};
        int[] arr = new int[]{9,9,9,9,9,8,4,3,2,1};
        isMonotonic(arr);
    }

    public static boolean isMonotonic(int[] array) {
        if(array.length == 0 || array.length == 1)return true;

        int i = 0;
        if(array.length >= 2){
            while(i < array.length - 1 && array[i] == array[i+1]){
                i++;
            }
            if(i+1 == array.length) return true;
            int[] arr = new int[array.length -i];
            System.arraycopy(array,i,arr,0,array.length-i);
            if(array[i] > array[i+1]){
               return checkForMonotoneDecreasing(arr);
            }else if(array[i] < array[i+1]){
                return checkForMonotoneIncreasing(arr);
            }
        }
        return false;
    }

    public static boolean checkForMonotoneIncreasing(int[] intArray){
        for(int i = 0; i < intArray.length -1; i++){
            if(intArray[i] <= intArray[i+1]){
                continue;
            }
            return false;
        }
        return true;
    }

    public static boolean checkForMonotoneDecreasing(int[] intArray){
        for(int i = 0; i < intArray.length - 1; i++){
            if(intArray[i] >= intArray[i+1]){
                continue;
            }
            return false;
        }
        return true;
    }
}
