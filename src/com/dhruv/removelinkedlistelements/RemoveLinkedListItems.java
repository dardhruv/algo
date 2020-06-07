package com.dhruv.removelinkedlistelements;
//Remove all elements from a linked list of integers that have value val.
//
//        Example:
//
//        Input:  1->2->6->3->4->5->6, val = 6
//        Output: 1->2->3->4->5
public class RemoveLinkedListItems {

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
//        l.next.next = new ListNode(6);
//        l.next.next.next = new ListNode(3);
//        l.next.next.next.next = new ListNode(4);
//        l.next.next.next.next.next = new ListNode(5);
//        l.next.next.next.next.next.next = new ListNode(6);

        ListNode m = new ListNode(6);
        m.next = new ListNode(6);
        m.next.next = new ListNode(6);
        removeElements(l,1);
    }

    public static ListNode removeElements(ListNode head,int val){
        ListNode trav = head;
        ListNode prev = null;
        while(head != null && head.val == val ){
            ListNode newHead = head.next;
            head = head.next = null;
            head = newHead;
        }
        if(head == null){
            return head;
        }
        while(trav != null){
            if(trav.val == val ){
                prev.next = trav.next;
                trav = null;
                trav = prev.next;
            }else{
                prev = trav;
                trav = trav.next;
            }
        }
            return head;
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
