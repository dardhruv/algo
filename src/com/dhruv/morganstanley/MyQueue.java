package com.dhruv.morganstanley;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();

    public MyQueue(){

    }

    // O(1) operation
    public void push(int x){
        stack1.push(x);
    }

    // O(n) operation as two times arrays are being copied from one array to another
    public int pop(){
        for(int i=stack1.size()-1; i>0;i--){
            stack2.push(stack1.pop());
        }
        int  returnValue =  stack2.pop();
        for(int i=stack2.size()-1; i>0; i--){
            stack1.push(stack2.pop());
        }
        return returnValue;
    }

    // O(1) operation
    public boolean empty(){
        return stack1.isEmpty();
    }

    public int peek(){
        int i = 0;
        while(i < stack1.size())
            i++;
        return stack1.get(i-1);
    }


}
