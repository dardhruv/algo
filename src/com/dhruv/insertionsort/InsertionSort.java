package com.dhruv.insertionsort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] intArray = new int[]{8,5,2,9,5,6,3};
        insertionSort(intArray);
    }

    public static int[] insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            if(array[i] < array[i-1]){
                swap(i,i-1,array);
            }
            for(int j=i-1;j >0; j--){
                if(array[j] < array[j-1]){
                    swap(j,j-1,array);
                }
            }
        }
        return array;
    }

    public static void swap(int i, int j, int[] array){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
