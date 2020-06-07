package com.dhruv.quicksort;

public class Quicksort {

    public static void main(String[] args) {
        int[] intArray = new int[]{-7, 2, 3, 8, -10, 4, -6, -10, -2, -7, 10, 5, 2, 9, -9, -5, 3, 8};
        System.out.println(quickSort(intArray));
    }

    public static int[] quickSort(int[] array){
        int start = 0;
        int end = array.length - 1;
        quickSort(start,end,array);
        return array;
    }

    public static void quickSort(int low,int high,int[] array){
        if(low < high){
            int j = partition(0,high,array);
            quickSort(0,j-1,array);
            quickSort(j+1,high,array);
        }
    }

    public static int partition(int low,int high,int[] array){
        int pivot = array[low];
        int i = low;
        int j = high;
        while(i < j){
            while(i < high && array[i] <= pivot ){
                i++;
            }
            while(array[j] > pivot && j>0){
                j--;
            }
            if(i < j) swap(i,j,array);
        }
        swap(low,j,array);
        return j;
    }

    public static void swap(int a, int b , int[] array){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
