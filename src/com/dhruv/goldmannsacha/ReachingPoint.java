package com.dhruv.goldmannsacha;

public class ReachingPoint {


    public static void main(String[] args) {
        reachingPoint(1,1,3,5);
    }

    public static boolean reachingPoint(int sx,int sy,int tx,int ty){

        while(tx >= sx && ty >= sy){
            if(tx == ty) break;
            if(tx > ty){
                if(ty > sy) tx %= ty;
                else return (tx - sx) % ty == 0;
            }else{
                if(tx > sx) ty %= tx;
                else return (ty -sy) % tx == 0;
            }
        }
    return tx == sx && sy == ty;
}

}
