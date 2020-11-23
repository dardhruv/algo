package com.dhruv.goldmannsacha;

public class MinPathSum {

    public static void main(String[] args) {
        int[][] intArray = {{1,3,4,8},{3,2,2,4},{5,7,1,9}};
        minPathSum(intArray);
    }

    private static int minPathSum(int[][] grid){
//        if(i==grid.length || j==grid[0].length) return Integer.MAX_VALUE;
//        if(i == grid.length-1 && j == grid[0].length -1) return grid[i][j];
//        return grid[i][j] + Math.min(minPathSum(grid,i+1,j),minPathSum(grid,i,j+1));
//
//        int dp[][] = new int[grid.length][grid[0].length];
//        for(int i=grid.length-1;i > 0; i--){
//            for(int j=grid[0].length-1; j > 0;j-- ){
//                if(i == grid.length -1 && j != grid[0].length -1){
//                    dp[i][j] = grid[i][j] + dp[i][j+1];
//                }
//                else if(i != grid.length -1 && j == grid[0].length -1){
//                    dp[i][j] = grid[i][j] + dp[i+1][j];
//                }
//                else if(i != grid.length -1 && j != grid[0].length -1){
//                    dp[i][j] = grid[i][j] + Math.min(dp[i+1][j],dp[i][j+1]);
//                }
//                else
//                    dp[i][j] = grid[i][j];
//            }
//        }
//        return dp[0][0];
//    }

        int[] dp = new int[grid[0].length];
        for(int i=grid.length -1; i >= 0; i--){
            for(int j=grid[0].length -1; j >=0; j--){
                if(i == grid.length -1 && j != grid[0].length -1)
                    dp[j] = grid[i][j] + dp[j+1];
                else if (j == grid[0].length -1 && i != grid.length -1)
                    dp[j] = grid[i][j] + dp[i+1];
                else if (i != grid.length -1 && j != grid[0].length -1 )
                    dp[j] = grid[i][j] + Math.min(dp[j],dp[j+1]);
                else
                    dp[j] = grid[i][j];
            }
        }
        return dp[0];
    }
}
