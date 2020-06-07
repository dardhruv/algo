package com.dhruv.pallindromiclinkedlist;

public class PallindromeLinkedList {

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(1);
        l.next.next = new ListNode(2);
        l.next.next.next = new ListNode(1);
//        l.next.next = new ListNode(3);
//        l.next.next.next = new ListNode(3);
//        l.next.next.next.next = new ListNode(2);
//        l.next.next.next.next.next = new ListNode(1);
        isPallindrome(l);
    }

      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 public static boolean isPallindrome(ListNode head){
        // If there is only one node or if there are only 2 nodes and both the nodes are same then return true
        if(head.next == null)return true;
        if(head.next.next == null && head.val != head.next.val)return false;
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        // Can fastPtr be null in any case when we are checking for fastptr.next.next
        while( fastPtr.next != null && fastPtr.next.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        // I have slow pointer and fast pointer . What i want to do now is to reverse from fast pointer till the last pointer
       // reverse the list now
        ListNode reversedList = slowPtr.next;
        ListNode trav = reversedList;
        ListNode prev = null;
        while(trav != null){
            ListNode temp = trav.next;
            trav.next = prev;
            prev = trav;
            trav = temp;
        }
        ListNode firstPtr = head;
        ListNode secondPtr = prev;

        while(firstPtr != null && secondPtr != null){
            if(firstPtr.val != secondPtr.val){
                return false;
            }
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }
        return true;
 }
}
