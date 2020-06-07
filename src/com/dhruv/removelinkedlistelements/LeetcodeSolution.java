package com.dhruv.removelinkedlistelements;

public class LeetcodeSolution {

    public static void main(String[] args) {

    }

    public static ListNode removeElements(ListNode head, int val) {
        if( head == null){
            return head;
        }
        ListNode fakeHead = new ListNode(-1);
        ListNode prev = fakeHead;
        ListNode trav = head;
        while(trav != null){
            if(trav.val == val){
                prev.next = trav.next;
                trav = trav.next = null;
                trav = prev.next;
            }else{
                prev.next = trav;
                trav = trav.next;
            }
        }
        return prev.next;
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
