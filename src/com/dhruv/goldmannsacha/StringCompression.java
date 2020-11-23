package com.dhruv.goldmannsacha;

public class StringCompression {

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a','a','b','b','c','c','c'}));
    }
    public static int compress(char[] chars){
        if(chars.length == 1)
            return 1;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<chars.length-1; i++){
            char ch = chars[i];
            int compressUnit = 1;
            sb.append(chars[i]);
            while(i < chars.length-1 && chars[i] == chars[i+1]){
                compressUnit++;
                i++;
            }
            if(compressUnit > 1){
                sb.append(compressUnit);
            }
        }
        if(chars[chars.length-1] != chars[chars.length-2]){
            sb.append(chars[chars.length-1]);
        }
        chars = sb.toString().toCharArray();
        return chars.length;
//        if(chars.length == 1)
//            return 1;
//        StringBuilder sb = new StringBuilder();
//        for(int i=0; i<chars.length-1; i++){
//            char ch = chars[i];
//            int compressUnit = 1;
//            sb.append(ch);
//            while(i<chars.length-1 && chars[i] == chars[i+1]){
//                compressUnit++;
//                i++;
//            }
//            if(compressUnit > 1){
//                sb.append(compressUnit);
//            }
//        }
//        if(chars[chars.length-1] != chars[chars.length -2]){
//            sb.append(chars[chars.length-1]);
//        }
//        return sb.toString().toCharArray().length;
    }
}
