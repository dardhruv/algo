package com.dhruv.goldmannsacha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Anagrams {

    public static void main(String[] args) {

    }

    public List<List<String>> groupAnagrams(String[] strs){
            if(strs.length == 0)
                return new ArrayList<>();
            String[] sortedWords = new String[strs.length];
            for(int i=0; i<strs.length; i++){
                String unsortedWord = strs[i];
                char[] charArray = unsortedWord.toCharArray();
                Arrays.sort(charArray);
                sortedWords[i] = charArray.toString();
            }

            List<Integer> indices = IntStream.range(0,strs.length).boxed().collect(Collectors.toList());
            indices.sort((a,b) -> sortedWords[a].compareTo(sortedWords[b]));

            List<List<String>> result = new ArrayList<>();
            List<String> currentAnagramGroup = new ArrayList<>();
            String currentAnagram = sortedWords[indices.get(0)];

            for(Integer index:indices){

            }
            return null;
    }
}
