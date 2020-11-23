package com.dhruv.goldmannsacha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LongestWordInDictionaryThroughDeleting {


    public boolean isValidSubsequence(String target,String source){
        int j = 0;
        for(int i=0; i<source.length() && j <target.length();i++){
            if(source.charAt(i) == target.charAt(j))
                j++;
        }
        return j == target.length();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("ale");
        list.add("apple");
        list.add("monkey");
        list.add("please");
        System.out.println(new LongestWordInDictionaryThroughDeleting().findLongestWord("abpcplea",list));
    }

    public String findLongestWord(String s, List<String> d){
        Collections.sort(d,new Comparator<String>(){
            public int compare (String s1,String s2){
                return s1.length() != s2.length() ? s2.length() - s1.length()   : s1.compareTo(s2);
            }
        });

        for(String str:d){
            if(isValidSubsequence(str,s))
                return str;
        }
        return "";
    }
}
