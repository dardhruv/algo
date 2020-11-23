package com.dhruv.goldmannsacha;

public class EggDropping {

    public static void main(String[] args) {
//        System.out.println(new EggSolver().solveUsingDp(8,4));
    }

    public int solveUsingDp(int n,int k){
        final int  results[][] = new int[n+1][k+1];
        for(int i=0; i < n; i++){
            results[i][i] = i;
        }
        return 0;
    }
}
