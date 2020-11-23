package com.dhruv.goldmannsacha;

import java.math.BigInteger;

import static java.lang.String.valueOf;

public class Atoi {

    public static int myAtoi(String s){
//        s = s.trim();
//        StringBuilder sb = new StringBuilder();
//        if(Character.isDigit(s.charAt(0)) || s.charAt(0) == '+' || s.charAt(0) == '-'){
//            //sb.append(s.charAt(0));
//            int i = 1;
//            //StringBuilder sb2 = new StringBuilder();
//            while( i < s.length()){
//                if(Character.isDigit(s.charAt(i))){
//                    sb.append(s.charAt(i));
//                }else{
//                    break;
//                }
//                i++;
//            }
//            if(sb.toString().length() > 0){
//              sb.insert(s.charAt(0),1);
//            }
//            BigInteger b_max = new BigInteger(valueOf(Integer.MAX_VALUE));
//            BigInteger b_min = new BigInteger(valueOf(Integer.MIN_VALUE));
//            BigInteger curentString = new BigInteger(valueOf(sb.toString()));
//            if(curentString.compareTo(b_max) > 1)
//                return Integer.MIN_VALUE;
//            if(curentString.compareTo(b_min) < 1)
//                return Integer.MIN_VALUE;
//            return Integer.parseInt(sb.toString());
//        }
//        return 0;
        if( s == null || s.length() == 0)
            return 0;
        int result = 0;
        int sign = 1;
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == ' ')
            i++;
        }
        if(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')){
        sign *= s.charAt(i++) == '+' ? 1:-1;
        }
        while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && s.charAt(i) - '0' > Integer.MAX_VALUE%10)){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result*10 + s.charAt(i) - '0';
        }
        return result*sign;
    }
}
