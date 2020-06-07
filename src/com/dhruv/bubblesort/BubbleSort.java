package com.dhruv.bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = new int[]{8,5,2,9,5,6,3};
        bubbleSort(intArray);
    }

    public static int[] bubbleSort(int[] array) {
        boolean swap = false;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length -1-i; j++){
                if(array[j] > array[j+1]){
                    swap(j,j+1,array);
                }
            }
        }
        return array;
    }

    public static void swap(int i,int j,int[] array){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
