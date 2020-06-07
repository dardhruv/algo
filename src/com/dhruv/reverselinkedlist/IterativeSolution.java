package com.dhruv.reverselinkedlist;

public class IterativeSolution {

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        l.next.next.next.next = new ListNode(5);
        l.next.next.next.next.next = null;
        reverseList(l);
    }
    public static ListNode reverseList(ListNode head){
        if(head == null ){
            return null;
        }
        ListNode prev = null;
        ListNode trav = head;
        while(trav != null){
            ListNode temp = trav.next;
            trav.next = prev;
            prev = trav;
            trav = temp;
        }
        return prev;
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode(){ }
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
}
