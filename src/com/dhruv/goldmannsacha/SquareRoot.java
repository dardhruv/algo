package com.dhruv.goldmannsacha;

public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(mySqrt(10));
    }


//    public static int mySqrt(int x){
//       if(x < 2) return x;
//
//       int left = (int)Math.pow(Math.E,0.5*Math.log(x));
//       int right = left+1;
//       return (long)right*right > x ? left:right;
//    }

    // xk+1 = [xk+x/xk]/2.0;
//    public static int mySqrt(int x) {
//        if(x < 2) return x;
//        double x0 = x;
//        double x1 = (x0+x/x0)/2.0;
//        while(Math.abs(x0 - x1) >=1){
//            x0 = x1;
//            x1 = (x0 + x/x0)/2.0;
//        }
//        return (int)x1;
//    }

    public static int mySqrt(int x){
        long num;
        int pivot,left = 2,right = x/2;
        while(left <= right){
            pivot = (left + right)/2;
            num = (long)pivot*pivot;
            if(num > x){
                right = pivot - 1;
            }else if (num < x) left = pivot + 1;
            else return pivot;
        }
        return right;
    }
}
