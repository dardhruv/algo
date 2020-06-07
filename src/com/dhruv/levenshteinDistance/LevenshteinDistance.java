package com.dhruv.levenshteinDistance;

public class LevenshteinDistance {

    public static void main(String[] args) {
        System.out.println(levenshteinDistance("abc","yabd"));
    }

    public static int levenshteinDistance(String str1, String str2) {
        int count = 0;
        int i=0;
        int j=0;
        while(i < str1.length() && j < str2.length()){
            if(str1.charAt(i) == str2.charAt(j)){
                i++;
                j++;
                continue;
            }
            if(str1.charAt(i) != str2.charAt(j)){
                j++;
                count++;
            }
        }
        if(i < str1.length() || j < str2.length()){
            if(str1.length() > str2.length()){
                count += str1.length()-i;
            }else{
                count += str2.length()-i;
            }
        }
        return count;
    }
}
