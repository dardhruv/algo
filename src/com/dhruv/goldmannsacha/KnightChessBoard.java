package com.dhruv.goldmannsacha;

public class KnightChessBoard {

    int dir[][] = new int[][]{{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}};


    public static void main(String[] args) {
        System.out.println(new KnightChessBoard().knightProbability(3,2,0,0));
    }

    private boolean isValid(int i,int j,int N){
        if(i >=0 && i < N && j >= 0 && j < N){
            return true;
        }
        return false;
    }
    public  double knightProbability(int N,int K,int r,int c){
        double[][] curr = new double[N][N];
        double[][] next = new double[N][N];
        curr[r][c] = 1;
        for(int m=1; m<=K; m++){
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(curr[i][j] != 0){
                        int ni = 0;
                        int nj = 0;
                        for(int a = 0; a < dir.length;a++ ){
                            ni = i + dir[a][0];
                            nj = j + dir[a][1];
                            if(isValid(ni,nj,N)){
                                next[ni][nj] += curr[i][j]/8.0;
                            }
                        }
                    }
                }
            }
            curr = next;
            next = new double[N][N];
        }

        double sum = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sum += curr[i][j];
            }
        }
        return sum;
    }
}
