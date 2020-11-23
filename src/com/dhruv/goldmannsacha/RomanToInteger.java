package com.dhruv.goldmannsacha;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    static Map<String,Integer> hMap = new HashMap<>();
    static int intValue = 0;

    public static void main(String[] args) {
            hMap.put("I",1);
            hMap.put("V",5);
            hMap.put("X",10);
            hMap.put("L",50);
            hMap.put("C",100);
            hMap.put("D",500);
            hMap.put("M",1000);
            hMap.put("IV",4);
            hMap.put("IX",9);
            hMap.put("XL",40);
            hMap.put("XC",90);
            hMap.put("CD",400);
            hMap.put("CM",900);

        System.out.println(romanToInt("MCDLXXVI"));
    }

    public static int romanToInt(String s){
        int i = s.length() -1;
        StringBuilder sb = new StringBuilder();
        if(s.length() == 1)
            return hMap.get(s);
        while(i >= 1){
            sb.append(s.charAt(i-1));
            sb.append(s.charAt(i));
            if(hMap.containsKey(sb.toString()))
            intValue += hMap.get(sb.toString());
            else{
                intValue += hMap.get(s.charAt(i)+"") + hMap.get(s.charAt(i-1)+"");
            }
            i = i-2;
            sb = new StringBuilder();
        }
        if((s.length() % 2) != 0 && s.length() > 1){
            intValue += hMap.get(s.charAt(0)+"");
        }
        return intValue;
    }
}
