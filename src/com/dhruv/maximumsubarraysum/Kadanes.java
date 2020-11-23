package com.dhruv.maximumsubarraysum;

public class Kadanes {

    public static void main(String[] args) {

    }

    public static int kadanesAlgorithm(int[] array){

        int maxEndingHere = array[0];
        int maxSoFar = array[0];

        for(int i=0; i < array.length; i++) {
            maxEndingHere = Math.max(maxEndingHere,array[i]);
            maxSoFar = Math.max(maxSoFar,maxEndingHere);
        }
        return maxEndingHere;
    }
}
