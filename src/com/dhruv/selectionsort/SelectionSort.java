package com.dhruv.selectionsort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{8,5,2,9,5,6,3};
        selectionSort(arr);
    }

    public static int[] selectionSort(int[] array){
        int pointer = Integer.MAX_VALUE;
        int pos = 0;
        for(int i = 0; i < array.length; i++){
            pointer = Integer.MAX_VALUE;
            for(int j = i; j < array.length; j++){
                if(array[j] < pointer){
                    pointer = array[j];
                    pos = j;
                }
            }
            swap(i,pos,array);
        }
        return array;
    }

    public static void swap(int i, int j, int[] array){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
