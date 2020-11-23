package com.dhruv.morganstanley;

import java.util.HashMap;
import java.util.Map;

public class DecodeWays {

    public static void main(String[] args) {
        System.out.println(new DecodeWays().recurseWithMemo(0,"2326"));
    }

    Map<Integer,Integer> memo = new HashMap<>();
    private int recurseWithMemo(int index,String s){
        if(index == s.length()) return 1;
        if(s.charAt(index) == '0') return 0;
        if(index == s.length() -1) return 1;

        if(memo.containsKey(index)){
            return memo.get(index);
        }
        int ans = recurseWithMemo(index+1,s);

        if(Integer.parseInt(s.substring(index,index+2)) <= 26){
            ans += recurseWithMemo(index+2,s);
        }

        memo.put(index,ans);
        return ans;
    }
    private int numDecodings(String s){
        if( s == null || s.length() == 0) return 0;
        return recurseWithMemo(0,s);
    }
}
