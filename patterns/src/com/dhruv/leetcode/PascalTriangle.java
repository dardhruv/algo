package com.dhruv.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(generate(num));

    }

    public static List<List<Integer>> generate(int num){
        List<List<Integer>> result = new ArrayList<>();
        if(num == 0){
            return new ArrayList<>(0);
        }
        if(num == 1){
            List<Integer> list = new ArrayList<Integer>();
            list.add(1);
            result.add(list);
            return result;
        }

        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);
        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);
        result.add(second);
        for(int i = 2; i < num; i++){
            List<Integer> list = result.get(i-1);
            List<Integer> current = new ArrayList<Integer>();
            current.add(1);
            for(int j = 1; j < list.size(); j++){
                current.add(list.get(j) + list.get(j-1));
            }
            current.add(1);
            result.add(current);
        }
        return result;
    }
}
