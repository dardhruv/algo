package com.dhruv.reverselinkedlist;

public class RecursiveSolution {

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        l.next.next.next.next = new ListNode(5);
        l.next.next.next.next.next = null;
        reverseList(l);
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(){ }
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverseList(ListNode head){
        if(head == null || head.next == null) return head;
        Long l  = 100000000000L;
        float f = (float)5.5;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;

    }
}
