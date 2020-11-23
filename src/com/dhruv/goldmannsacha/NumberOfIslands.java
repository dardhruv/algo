package com.dhruv.goldmannsacha;

public class NumberOfIslands {

    public int numIslands(char[][] grid){
        
        int num_islands = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j] == '1'){
                    num_islands += 1;
                }
            }
        }
        return num_islands;
    }

    // >= boundary beacuse where it will go after crossing the booundary so doesnt make sense
    private void markCurrentIslands(char[][] grid,int x,int y,int rows,int cols){
        if(x < 0 || x >= rows || y < 0 || y >= cols || grid[x][y] != '1'){
            grid[x][y] = '2';

            markCurrentIslands(grid,x+1,y,rows,cols);
            markCurrentIslands(grid,x-1,y,rows,cols);
            markCurrentIslands(grid,x,y+1,rows,cols);
            markCurrentIslands(grid,x,y-1,rows,cols);
        }
    }
}
