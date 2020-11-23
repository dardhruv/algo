package com.dhruv.goldmannsacha;

public class GameOfLife {

    public void gameOfLife(int[][] board){
        int m = board.length;
        int n = board[0].length;
        int[][] dirs = new int[][]{{-1,0},{-1,1},{-1,-1},{0,1},{0,-1},{1,0},{1,1},{1,-1}};
        int next[][] = new int[m][n];



        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[0].length; col++){
                int liveCount = 0;
                for(int[] dir:dirs){
                    int x = row+dir[0];
                    int y = col+dir[1];
                    if(x >= 0 && x < board.length && y >= 0 && y < board[0].length && board[x][y] == 1){
                        liveCount++;
                    }
                }

                if(board[row][col] == 1 && (liveCount > 3 || liveCount < 2)){
                    next[row][col] = 0;
                }else if(board[row][col] == 1 && (liveCount == 2 || liveCount == 3)){
                    next[row][col] = 1;
                }else if (board[row][col] == 0 && liveCount == 3){
                    next[row][col] = 1;
                }
            }
        }

        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[0].length;col++){
                board[row][col]= next[row][col] ;
            }
        }
    }
}
