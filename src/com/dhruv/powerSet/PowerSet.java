package com.dhruv.powerSet;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<Integer>();
        input.add(1);
        input.add(2);
        input.add(3);
        powerset(input);
    }

    public static List<List<Integer>> powerset(List<Integer> array) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        result.add(list);
        System.out.println(result);
        return getPowerSet(result,array);

    }

    public static List<List<Integer>> getPowerSet(List<List<Integer>> result,List<Integer> array){
        List<List<Integer>> input = new ArrayList<>(result);
        if(array.size() > 0){
            int firstElement = array.get(0);
            array.remove(0);
            List<Integer> currentElementList = new ArrayList<>();
            currentElementList.add(firstElement);
            for(int i = 0; i < result.size(); i++){
                List<Integer> list = result.get(i);
                if(list.size() != 0){
                    List<Integer> entry = new ArrayList<>(list);
                    entry.add(firstElement);
                    input.add(entry);
                }
            }
            input.add(currentElementList);
            return getPowerSet(input,array);
        }
        return getPowerSet(input,array);
    }
}
