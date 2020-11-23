package com.dhruv.queue;

import java.util.EmptyStackException;
import java.util.Stack;

public class QueueUsingSingleStack {

    static class Queue{
        Stack<Integer> stack1;
    }

    static void push(Stack<Integer> top_ref,int new_data){
        top_ref.push(new_data);
    }

    static int pop(Stack<Integer> top_ref){
        if(top_ref == null){
            throw new EmptyStackException();
        }
        return top_ref.pop();
    }

    static void enQueue(Queue q,int x){
        push(q.stack1,x);
    }

    static int deQueue(Queue q){
        int x,res = 0;
        if(q.stack1.isEmpty())
            throw new EmptyStackException();
        else if(q.stack1.size() == 1)
            return q.stack1.pop();
        else {
            x = pop(q.stack1);
            res = deQueue(q);
            push(q.stack1,x);
            return res;
        }
    }

    public static void main(String[] args)
    {
        /* Create a queue with items 1 2 3*/
        Queue q = new Queue();
        q.stack1 = new Stack<>();

        enQueue(q, 1);
        enQueue(q, 2);
        enQueue(q, 3);

        /* Dequeue items */
        System.out.print(deQueue(q) + " ");
        System.out.print(deQueue(q) + " ");
        System.out.print(deQueue(q) + " ");
    }
}
