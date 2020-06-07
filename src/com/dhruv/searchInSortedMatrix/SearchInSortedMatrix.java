package com.dhruv.searchInSortedMatrix;

import java.util.Scanner;

public class SearchInSortedMatrix {

    public static int[] searchInSortedMatrix(int[][] matrix, int target) {
        int colCount = matrix[0].length;
        int rowCount = matrix.length;
        int i = 0;
        int j = colCount-1;
        while(i <= rowCount -1 && j >= 0){
            if(matrix[i][j] == target){
                break;
            }
                if( j > 0){
                    if(matrix[i][j] > target ){
                        if(j == 0 ){
                            break;
                        }
                        j--;
                    }
                }
                if(i < rowCount-1){
                    if(matrix[i][j] < target){
                        if(i == rowCount-1){
                            break;
                        }
                        i++;
                    }
                }

        }
        if(matrix[i][j] == target){
            return new int[]{i,j};
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the value of target element");
        int target = s.nextInt();
        int[][] arr = createMatrix();
        searchInSortedMatrix(arr,target);
    }
    public static int[][] createMatrix(){
        int[][] intArray = new int[5][6];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            for(int j=0; j<6; j++){
                System.out.println( "Please enter value for array index "+ i+", "+j);
                intArray[i][j]=sc.nextInt();
            }
        }
        return intArray;
    }
}
