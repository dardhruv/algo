package com.dhruv.goldmannsacha;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class LastSubstringInLexicographicalOrde {

    public static void main(String[] args) {
        System.out.println(new LastSubstringInLexicographicalOrde().lastSubstring("zrziy"));
    }
    public String lastSubstring(String s) {
//        int n=s.length(),i=0,j=1,k=0;
//        while(j+k<n)
//        {
//            if(s.charAt(i+k)==s.charAt(j+k)) {
//                k++;
//            }
//            else if(s.charAt(i+k)<s.charAt(j+k)){
//                i=j++;
//               // k=0;
//        }
//            else {
//                j+= k+1;
//                //k=0;
//        }
//        }
//        return s.substring(i);
//    }
        int l = s.length();
        int i = 0, j = 1, k = 0;
        while(j + k < l) {
            if (s.charAt(i+k) == s.charAt(j+k)){
                k++;
                continue;
            }
            if (s.charAt(i+k) > s.charAt(j+k)){
                j++;
            } else {
                i = j;
                j = i + 1;
            }
            k = 0;
        }

        return s.substring(i);
    }}
