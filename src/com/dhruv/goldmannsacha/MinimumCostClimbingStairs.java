package com.dhruv.goldmannsacha;

public class MinimumCostClimbingStairs {

    private int minCostClimbingStairs(int[] cost){
        int f1 = cost[0];
        int f2 = cost[1];

        for(int i=2; i<cost.length; i++){
            int currentCost = cost[i] + Math.min(f1,f2);
            f1 = f2;
            f2 = currentCost;
        }
        return Math.min(f1,f2);
    }
}
