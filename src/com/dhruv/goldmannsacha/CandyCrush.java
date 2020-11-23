package com.dhruv.goldmannsacha;

import java.util.ArrayDeque;

public class CandyCrush {
    public static void main(String[] args) {
        int[] input = new int[]{1,3, 3, 3 , 2, 2, 2, 3, 1};
        System.out.println(remove(input));
    }
    public static int[] remove(int[] in){
        if(in.length == 1) return in;
        int lastSeen = in[0];
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(in[0]);
        for(int i=1; i<in.length; i++){
            while(deque.isEmpty()){
                deque.add(in[1]);
                i++;
                lastSeen = in[i];
            }
            int last = deque.getLast();
            if(in[i] == lastSeen){
                if(in[i]==last){
                    deque.pollLast();
                    lastSeen = in[i];
                }else{
                    i++;
                }
            }else{
                deque.add(in[i]);
                lastSeen = in[i];
            }
        }
        int[] result = new int[deque.size()];
        int i=0;
        while(!deque.isEmpty()){
            result[i++] = deque.pollFirst();
        }
        return result;
    }
}
