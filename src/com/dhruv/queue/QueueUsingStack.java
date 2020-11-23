package com.dhruv.queue;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Stack;

public class QueueUsingStack {

    // this implementation makes enqueu operation costly
    // this implementation uses 2 stacks to emulate queue behaviour and enqueu operation is costly here
//    static class Queue {
//
//        static Stack<Integer> s1 = new Stack<>();
//        static Stack<Integer> s2 = new Stack<>();
//
//        // enqueu operation is O(N) time complexity
//        static void enqueue(int x){
//            while(!s1.isEmpty()){
//                s2.push(s1.pop());
//            }
//            s1.push(x);
//            while(!s2.isEmpty()){
//                s1.push(s2.pop());
//            }
//        }
//        // O(1) time complexity
//        static int deque(){
//            if(s1.isEmpty()){
//                throw new EmptyStackException();
//            }
//            int x = s1.peek();
//            s1.pop();
//            return x;
//        }
//    }

    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();


        static void enqueue(int x){
            s1.push(x);
        }

        static int deque(){
            if(s1.isEmpty())
                throw new EmptyStackException();
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int x = s2.peek();
            return x;
        }
    }
}
