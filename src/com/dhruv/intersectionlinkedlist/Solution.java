package com.dhruv.intersectionlinkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(4);
        ListNode next1 = new ListNode(1);
        ListNode next2 = new ListNode(8);
        ListNode next3 = new ListNode(4);
        ListNode next4 = new ListNode(5);
        head1.next = next1;
        next1.next = next2;
        next2.next = next3;
        next3.next = next4;

        ListNode head2 = new ListNode(5);
        ListNode next5 = new ListNode(0);
        ListNode next6 = new ListNode(1);
        ListNode next7 = new ListNode(8);
        ListNode next8 = new ListNode(5);
        ListNode next9 = new ListNode(4);

        head2.next = next5;
        next5.next = next6;
        next6.next = next7;
        next7.next = next8;
        next8.next = next9;

        getIntersectionNode(head1,head2);
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        //if a & b have different len, then we will stop the loop after second iteration
        while( a != b){
            //for the end of first iteration, we just reset the pointer to the head of another linkedlist
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }

        return a;
        }

     // Definition for singly-linked list.
     static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
