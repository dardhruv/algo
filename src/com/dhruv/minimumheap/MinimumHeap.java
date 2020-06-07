package com.dhruv.minimumheap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumHeap {
    //Binary heap must have all its levels filled up except the last level which if partly filled up has to be
    // filled up from left to right
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{48, 12, 24, 7, 8, -5, 24, 391, 24, 56, 2, 6, 8, 41};
        List<Integer> list = Arrays.asList(arr);
        MinHeap heap = new MinHeap(list);
    }

    static class MinHeap {
        List<Integer> heap = new ArrayList<Integer>();

        public MinHeap(List<Integer> array){
            heap = buildHeap(array);
        }
        public List<Integer> buildHeap(List<Integer> array) {
            int firstParentIdx = (array.size()-2)/2;
            for(int currentIdx = firstParentIdx; currentIdx >= 0; currentIdx --){
                siftDown(currentIdx,array.size()-1,array);
            }
            return array;
        }

        public void siftDown(int currentIdx, int endIdx, List<Integer> heap) {
            int childOneIdx = currentIdx*2 +1;
            while(childOneIdx <= heap.size()-1){
                int childTwoIdx = currentIdx*2 +2;
                if(heap.size() -1 < childTwoIdx) childTwoIdx = -1;
                int indexToSwap = childOneIdx;
                if(childTwoIdx != -1 && heap.get(childTwoIdx) < heap.get(childOneIdx)){
                    indexToSwap = childTwoIdx;
                }
                if(heap.get(indexToSwap) < heap.get(currentIdx)){
                    swap(indexToSwap,currentIdx,heap);
                    currentIdx = indexToSwap;
                    childOneIdx = currentIdx*2 +1;
                }
                else{
                    break;
                }
            }
        }
        // check this method in the ide if this is not correct
        public void siftUp(int currentIdx, List<Integer> heap) {
            while(currentIdx > 0){
                int parentIdx = (currentIdx -1)/2;
                if(heap.get(parentIdx) > heap.get(currentIdx)){
                    swap(parentIdx,currentIdx,heap);
                    currentIdx = parentIdx;
                }else{
                    break;
                }
            }
        }

        public int peek() {
            return heap.get(0);
        }

        public int remove() {
            int valueToRemove = heap.get(0);
            swap(0,heap.size()-1,heap);
            heap.remove(heap.size()-1);
            siftDown(0,heap.size()-1,heap);
            return valueToRemove;
        }

        public void insert(int value) {
            heap.add(value);
            siftUp(heap.size()-1,heap);
        }

        public void swap(int i,int j,List<Integer> list){
            int temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
        }


//        public List<Integer> buildHeap(List<Integer> array){
//            int firstParentIdx = ((array.size()-2)/2);
//            for(int currentIdx = firstParentIdx; currentIdx > 0; currentIdx--){
//                siftDown(currentIdx,array.size()-1,array);
//            }
//            return array;
//        }
//
//        public void siftDown(int curentIdx,int endIdx,List<Integer> heap){
//            int childOneIdx = 2*curentIdx +1;
//            // below while statement means that there is at least one child node then only sift down
//            while(childOneIdx <= endIdx){
//                int childTwoIdx = 2*curentIdx+2;
//                if(childTwoIdx > heap.size()-1) childTwoIdx = -1;
//                int indexToSwap = childOneIdx;
//                if(childTwoIdx != -1 && heap.get(childTwoIdx) < heap.get(childOneIdx)){
//                    indexToSwap = childTwoIdx;
//                }
//                if(heap.get(indexToSwap) < heap.get(curentIdx)){
//                    swap(indexToSwap,curentIdx,heap);
//                    curentIdx = indexToSwap;
//                    childOneIdx = curentIdx*2 + 1;
//                }else{
//                    break;
//                }
//            }
//        }
//
//        public void siftUp(int currentIdx,List<Integer>heap){
//            int parentIdx = ((currentIdx -1)/2);
//            while(currentIdx > 0 && heap.get(parentIdx) > heap.get(currentIdx)){
//                swap(currentIdx,parentIdx,heap);;
//                currentIdx = parentIdx;
//                parentIdx = (currentIdx-1)/2;
//            }
//        }
//
//        public int peek(){
//            return heap.get(0);
//        }
//
//        public int remove(){
//            int valueToRemove = heap.get(0);
//            swap(0,heap.size()-1,heap);
//            heap.remove(heap.size()-1);
//            siftDown(0,heap.size()-1,heap);
//            return valueToRemove;
//        }
//
//        public void insert(int value){
//            heap.add(value);
//            siftUp(heap.size()-1,heap);
//        }
//
//        public void swap(int i, int j, List<Integer> array){
//            int temp = array.get(i);
//            array.set(i,array.get(j));
//            array.set(j,temp);
//        }
    }
}
