package com.dhruv.linkedlist;

import java.util.LinkedList;

public class RemoveKthNodeFromEnd {

    static class LinkedList{
        int value;
        LinkedList next = null;
    }


    public static void removeKthNodeFromEnd(LinkedList head,int k){
        int counter = 1;
        LinkedList first = head;
        LinkedList second = head;
        while(counter <=k){
            second = second.next;
            counter++;
        }
    }

}
