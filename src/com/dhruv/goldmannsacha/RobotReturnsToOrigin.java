package com.dhruv.goldmannsacha;

public class RobotReturnsToOrigin {

    public static void main(String[] args) {
        String str = "LDRRLRUULR";
        System.out.println(judgeCircle(str));
    }

    public static boolean judgeCircle(String moves){
        int[] arr = new int[]{0,0};
        int i = 0;
        while(i < moves.length()){
            if(moves.charAt(i) == 'U'){
                arr[1] += 1;
            }else if(moves.charAt(i) == 'D'){
                arr[1] -= 1;
            }else if (moves.charAt(i) == 'R'){
                arr[0] += 1;
            }
            else if (moves.charAt(i) == 'L'){
                arr[0] -= 1;
            }
            i++;
        }
        if(arr[0] == 0 && arr[1] == 0)
            return true;
        return false;
    }
}
