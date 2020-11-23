package com.dhruv.revision;

import java.util.*;

public class AnagramGroup {

    public static void main(String[] args) {
        groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        String[] auxiliaryArray = new String[strs.length];
        System.arraycopy(strs,0,auxiliaryArray,0,strs.length);
        for(int i=0; i<strs.length; i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            auxiliaryArray[i] = new StringBuilder(String.valueOf(charArray)).toString();
        }
        HashMap<String,List<Integer>> anagramMap = new HashMap<>();
        for(int i=0; i<auxiliaryArray.length; i++){
            if(!anagramMap.containsKey(auxiliaryArray[i])){
                List<Integer> anagramList = new ArrayList<>();
                anagramList.add(i);
                anagramMap.put(auxiliaryArray[i],anagramList);
            }else{
                List<Integer> anagramList = anagramMap.get(auxiliaryArray[i]);
                anagramList.add(i);
                anagramMap.put(auxiliaryArray[i],anagramList);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String,List<Integer>> entry:anagramMap.entrySet()){
            List<String> anagramGroup = new ArrayList<>();
            List<Integer> indices = entry.getValue();
            for(int i=0; i<indices.size(); i++){
                anagramGroup.add(strs[indices.get(i)]);
            }
            result.add(anagramGroup);
        }
        return result;
    }
}
