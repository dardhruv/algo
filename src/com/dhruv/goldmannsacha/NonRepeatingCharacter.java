package com.dhruv.goldmannsacha;

import java.util.*;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(firstUniqueChar("leetcode"));
    }


//    public static int firstUniqueChar(String s) {
//        //String s = "leetcode";
//        Map<Character,Integer> hMap = new LinkedHashMap<>();
//        int i = 0;
//        while(i < s.length()){
//            if(!hMap.containsKey(s.charAt(i))){
//                hMap.put(s.charAt(i),i);
//            }
//            else{
//                hMap.remove(s.charAt(i));
//            }
//            i++;
//        }
//        List<Character> chars = new ArrayList<>(hMap.keySet());
//        System.out.println(hMap.get(chars.get(chars.size()-1)));
//        return hMap.get(chars.get(chars.size()-1));
//    }

    public static int firstUniqueChar(String s){
        Map<Character,Integer> hMap = new HashMap<>();
        int i = 0;
        while(i < s.length()){
            if(hMap.containsKey(s.charAt(i))){
                hMap.put(s.charAt(i),1);
            }else{
                hMap.put(s.charAt(i),hMap.get(s.charAt(i)+1));
            }
            i++;
        }
        int j = 0;
        while(j < s.length()){
            int count = hMap.get(s.charAt(j));
            if(count == 1)
                return hMap.get(s.charAt(i));
        }
        return -1;
    }

}
