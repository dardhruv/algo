package com.dhruv.goldmannsacha;

import java.util.*;

public class ArrangeNumberToGetLargest {

    public static void main(String[] args) {
        System.out.println(largestNumber(new int[]{8308,8308,830}));
    }

    public static String largestNumber(int[] nums){
    String[] str = new String[nums.length];
    //System.arraycopy(nums,0,str,0,nums.length);
    for(int i=0; i<nums.length; i++){
        str[i] = Integer.toString(nums[i]);
    }
        List<String> stringList = Arrays.asList(str);
        stringList.sort((str1,str2) -> {
            String S1 = str1 + str2;
            String S2 = str2 + str1;
            return S1.compareTo(S2) > 0 ? -1 : 1;
        });
        Iterator<String> itr = stringList.listIterator();
        StringBuilder sb = new StringBuilder();
        while(itr.hasNext()){
            sb.append(itr.next());
        }
        if(sb.toString().startsWith("0")){
            return "0";
        }
        return sb.toString();
    }
}
