package com.dhruv.goldmannsacha;

import java.util.ArrayList;
import java.util.List;

public class FractionAdditionsSubtraction {


    public String fractionAddition(String expression){
        List<Character> sign = new ArrayList<>();
        if(expression.charAt(0) != '-') sign.add('+');
        for(int i=0; i<expression.length(); i++){
            if(expression.charAt(i) == '-' || expression.charAt(i) == '+')
                sign.add(expression.charAt(i));
        }

        int prev_num = 0,prev_den = 1,i=0;
        for(String sub:expression.split("(\\+)|(-)")){
            if(sub.length() > 0){
                String[] fraction = sub.split("/");
                int num = Integer.parseInt(fraction[0]);
                int den = Integer.parseInt(fraction[1]);
                int g = Math.abs(gcd(num,den));

            }
        }
        return null;
    }
    private int gcd(int a,int b){
        while(b != 0){
            int t = b;
            b = a%b;
            a = t;
        }
        return a;
    }
}
