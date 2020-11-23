package com.dhruv.linkedlist;

import sun.font.CoreMetrics;

public class ReverseLinkedList {

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value){
            this.value = value;
        }
    }

    public static LinkedList reverseLinkedList(LinkedList head){
        LinkedList previousNode = null;
        LinkedList currentNode = head;
        while(currentNode != null){
            LinkedList nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }
}
