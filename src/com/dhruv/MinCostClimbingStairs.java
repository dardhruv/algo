package com.dhruv;

public class MinCostClimbingStairs {

    public static void main(String[] args) {
        int[] input = new int[]{10,15,20};
        System.out.println(minCostClimbingStairs(input));
    }

//    public int minCostClimbingStairs(int[] cost){
//        int step1 = 0;
//        int step2 = 0;
//        for(int i=cost.length-1; i>=0; i--){
//            int current_step = cost[i] + Math.min(step1,step2);
//            step1 = step2;
//            step2 = current_step;
//        }
//        return Math.min(step1,step2);
//    }


    public static int minCostClimbingStairs(int[] cost){
        int a = cost[0];
        int b = cost[1];
        for(int i=2; i<cost.length; i++){
            a = b;
            b = Math.min(a,b) + cost[i];
        }

        return Math.min(a,b);
    }
}
