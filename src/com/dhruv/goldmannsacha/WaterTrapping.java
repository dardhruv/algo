package com.dhruv.goldmannsacha;

public class WaterTrapping {


    public static void main(String[] args) {
        System.out.println(waterArea(new int[]{4,2,0,3,2,5}));
    }

    public static int waterArea(int[] heights){

        int[] leftMax = new int[heights.length];
        int[] rightMax = new int[heights.length];

        int totalWater = 0;

        leftMax[0] = heights[0];

        for(int i=1; i<heights.length; i++){
            leftMax[i] = Math.max(heights[i],leftMax[i-1]);
        }
        rightMax[heights.length-1] = heights[heights.length-1];
        for(int i=heights.length-2; i>=0; i--){
            rightMax[i] = Math.max(heights[i],rightMax[i+1]);
        }

        for(int i=1; i<heights.length-1; i++){
            totalWater += Math.min(leftMax[i],rightMax[i]) -heights[i];
        }
        return totalWater;
    }
}
