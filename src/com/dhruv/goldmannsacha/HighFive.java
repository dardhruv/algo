package com.dhruv.goldmannsacha;

import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class HighFive {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
        highFive(arr);
    }

    private static int[][] highFive(int[][] items){
            Map<Integer,PriorityQueue<Integer>> studentMap = new TreeMap<>();
            for(int[] item:items){
                int id = item[0];
                int score = item[1];
                PriorityQueue<Integer> queue = null;
                if(!studentMap.containsKey(id)){
                     queue = new PriorityQueue<>();
                    queue.add(score);
                }else{
                     queue = studentMap.get(id);
                    queue.add(score);
                }
                if(queue.size() > 5){
                    queue.poll();
                }
                studentMap.put(id,queue);

            }
            int count = 0;
            int[][] result = new int[studentMap.size()][2];
            for(int id:studentMap.keySet()){
                PriorityQueue<Integer> queue = studentMap.get(id);
                int sum = 0;
                while(!queue.isEmpty()){
                    sum += queue.poll();
                }
                int average = sum/5;
                result[count][0] = id;
                result[count][1] = average;
                count++;
            }

            return result;
        }


}


