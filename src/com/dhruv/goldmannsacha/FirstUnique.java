package com.dhruv.goldmannsacha;

import java.util.*;

public class FirstUnique {


    public static void main(String[] args) {
        System.out.println(new FirstUnique().firstUniqChar("loveleetcode"));
    }
        public int firstUniqChar(String s) {
            Map<Character, Integer> hMap = new LinkedHashMap<>();
            int length = s.length();
            int i = 0;
            while (i < length) {
                if (!hMap.containsKey(s.charAt(i))) {
                    hMap.put(s.charAt(i), 1);
                } else {
                    hMap.put(s.charAt(i), hMap.get(s.charAt(i)) + 1);
                }
                i++;
            }
            Character ch = null;
            Iterator<Map.Entry<Character, Integer>> itr = hMap.entrySet().iterator();
            while (itr.hasNext()) {
                Map.Entry<Character, Integer> entry = itr.next();
                if (entry.getValue() == 1)
                    ch = entry.getKey();
                break;
            }
            return ch != null ? s.indexOf(ch) : 0;


        }
}
