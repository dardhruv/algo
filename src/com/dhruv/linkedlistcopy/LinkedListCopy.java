package com.dhruv.linkedlistcopy;



public class LinkedListCopy {

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(2);
        l.next.next.next.next = new ListNode(1);
        isPalindrome(l);
    }

      public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static boolean isPalindrome(ListNode head){
        ListNode trav = head;
        ListNode node = null;
        while(trav != null){
            node = trav;
            trav = trav.next;
            node = node.next;
        }
        return true;
    }
}
