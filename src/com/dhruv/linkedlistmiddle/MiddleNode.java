package com.dhruv.linkedlistmiddle;

import java.util.HashMap;
import java.util.Map;

public class MiddleNode {

    public static void main(String[] args) {
        ListNode node = new ListNode(65);
        node.next = new ListNode(66);
        node.next.next = new ListNode(26);
        node.next.next.next = new ListNode(77);
        node.next.next.next.next = new ListNode(96);
        node.next.next.next.next.next = new ListNode(86);
        node.next.next.next.next.next.next = new ListNode(11);
        node.next.next.next.next.next.next.next = new ListNode(21);
        node.next.next.next.next.next.next.next.next = new ListNode(13);
        node.next.next.next.next.next.next.next.next.next = new ListNode(80);
        System.out.println(middleNode(node));
    }

    static public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode middleNode(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode trav = head;
        Map<Integer,ListNode> entryMap = new HashMap<>();
        int count = 0;
        while(trav != null){
            count++;
            entryMap.put(count,trav);
            trav = trav.next;
        }
        int size = entryMap.size();
        ListNode returnValue =  entryMap.get((size/2)+1);
        return returnValue;
    }
}
