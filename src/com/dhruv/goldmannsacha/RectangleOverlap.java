package com.dhruv.goldmannsacha;

public class RectangleOverlap {

    static class Point {
        int x,y;
    }

    static boolean doOverlap(Point l1,Point r1,Point l2,Point r2){
        // if one rectangle is on left side of another
        if(l1.x >= r2.x || l2.x >= r1.x ){
            return false;
        }

        // if one rectangle is above another
        if(r1.y > l2.y || r2.y > l1.y){
            return false;
        }
        return true;
    }
}
