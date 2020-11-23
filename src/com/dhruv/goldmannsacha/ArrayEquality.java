package com.dhruv.goldmannsacha;

import java.util.HashMap;
import java.util.Map;

public class ArrayEquality {

    static Map<Long,Integer> hMap1 = new HashMap<>();
    static Map<Long,Integer> hMap2 = new HashMap<>();

    public static void main(String[] args) {
        Long[] long1 = new Long[]{1L,2L,3L,3L,3L,4L};
        Long[] long2 = new Long[]{1L,2L,3L,3L,3L,4L};
        System.out.println(check(long1,long1,6));
    }
//    public static boolean check(Long arr[],Long brr[],int n){
//
//        // O(N)
//        for(int i=0; i<arr.length;i++){
//                if(!hMap1.containsKey(arr[i])){
//                    hMap1.put(arr[i],1);
//                }else{
//                    hMap1.put(arr[i],hMap1.get(arr[i])+1);
//                }
//        }
//        // O(N)
//        for(int i=0; i<brr.length; i++){
//            if(!hMap2.containsKey(brr[i])){
//                hMap2.put(brr[i],1);
//            }else{
//                hMap2.put(brr[i],hMap2.get(brr[i])+1);
//            }
//        }
//        //O(N)
//        for(Map.Entry<Long,Integer> entry:hMap1.entrySet()){
//            if(hMap1.get(entry.getKey()) != hMap2.get(entry.getKey())){
//                return false;
//            }
//        }
//    return true;
//    }


    // O(N) time complexity O(1) space complexity
//    public static boolean check(Long arr[],Long brr[],int n){
//        Long a1 = arr[0];
//        Long b1 = brr[0];
//
//        for(int i=0; i<arr.length;i++){
//            a1 ^= arr[i];
//            b1 ^= brr[i];
//        }
//
//        long all_xor = a1^b1;
//        if(all_xor == 0)
//            return true;
//        return false;
//    }


    // unordered map

    public static boolean check(Long[] arr,Long[] brr,int n){
                for(int i=0; i<arr.length;i++){
                if(!hMap1.containsKey(arr[i])){
                    hMap1.put(arr[i],1);
                }else{
                    hMap1.put(arr[i],hMap1.get(arr[i])+1);
                }
        }

                for(int i=0; i<brr.length;i++){
                    if(!hMap1.containsKey(brr[i]))
                        return false;
                    if(hMap1.get(brr[i]) == 0)
                        return false;
                    int count = hMap1.get(brr[i]);
                    --count;
                    hMap1.put(brr[i],count);

                }
                return true;
    }
}
