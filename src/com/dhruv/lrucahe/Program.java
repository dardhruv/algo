package com.dhruv.lrucahe;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleToIntFunction;

public class Program {

    public static void main(String[] args) {
        LRUCache lr = new LRUCache(3);
        lr.insertKeyValuePair("b",2);
        lr.insertKeyValuePair("a",1);
        lr.insertKeyValuePair("c",3);
        lr.getMostRecentKey();
        lr.getValueFromKey("a");
        lr.getMostRecentKey();
        lr.insertKeyValuePair("d",4);
        lr.getValueFromKey("b");
        lr.insertKeyValuePair("a",5);
        lr.getValueFromKey("a");

    }

    static class LRUCache {
        Map<String,DoublyLinkedListNode> cache = new HashMap<>();
        int maxSize;
        int currentSize = 0;
        DoublyLinkedList listOfMostRecent = new DoublyLinkedList();
        public LRUCache(int maxSize) {
            this.maxSize = maxSize > 1 ? maxSize : 1;
        }

        public DoublyLinkedListNode insertKeyValuePair(String key, int value) {
            if(!cache.containsKey(key)){
                if(maxSize == currentSize){
                    evictLeastRecentlyUsed();
                }else{
                    currentSize += 1;
                }
                cache.put(key,listOfMostRecent.addFirst(key,value));
            }
            DoublyLinkedListNode node = cache.get(key);
             listOfMostRecent.remove(node);
           return  listOfMostRecent.addFirst(key,value);
        }

        public LRUResult getValueFromKey(String key) {
            if(!cache.containsKey(key)){
                return new LRUResult(false,-1);
            }
            DoublyLinkedListNode node = cache.get(key);
            DoublyLinkedListNode returnvalue = updateLeastRecentlyUsed(key);
            cache.put(key,returnvalue);
            return new LRUResult(true,node.value);
        }

        public String getMostRecentKey() {
            // Write your code here.
            if(listOfMostRecent != null && listOfMostRecent.head != null){
                return listOfMostRecent.head.key;
            }
            return null;
        }
        public DoublyLinkedListNode updateLeastRecentlyUsed(String key){
            DoublyLinkedListNode node = cache.get(key);
            return listOfMostRecent.updateHead(node);
        }

        public void evictLeastRecentlyUsed(){
            String key = listOfMostRecent.tail.key;
            listOfMostRecent.removeLast();
            cache.remove(key);

        }
    }



    static class LRUResult {
        boolean found;
        int value;

        public LRUResult(boolean found, int value) {
            this.found = found;
            this.value = value;
        }
    }

    static class DoublyLinkedList {
        int size = 0;
        DoublyLinkedListNode head = null;
        DoublyLinkedListNode tail = null;

        public DoublyLinkedList(){
        }

        public void updateNode(DoublyLinkedListNode node,int value){
            node.value = value;
            if(node.next == null){
                node.prev.next = node.next;
            }
            else if(node.prev == null){
                node.next.prev = node.prev;
            }else{
                node.next.prev = node.prev;
                node.prev.next = node.next;
            }
            head.prev = node;
            node.next = head;
            node = head;
        }
        public DoublyLinkedListNode remove(DoublyLinkedListNode node){
            if(node.next == null){
                removeLast();
            }else if(node.prev == null){
                removeFirst();
            }
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.prev = node.next =  null;
            size--;
            return node;
        }

        public void removeLast(){
            if(isEmpty()){
                throw new RuntimeException("List is empty");
            }
            tail = tail.prev;
            size--;
            if(isEmpty())
                head = tail = null;
            else tail.next = null;
        }

        public void removeFirst(){
            if(isEmpty()) {
                throw new RuntimeException("list is empty");
            }
            head = head.next;
            size--;
            if(isEmpty())
                tail = head = null;
            else
                head.prev = null;
        }

        public DoublyLinkedListNode addFirst(String key,int value){
            DoublyLinkedListNode node = new DoublyLinkedListNode(key,value,null,null);
            if(isEmpty()){
                head = tail = node;
            }else {
                node.next = head;
                head.prev = node;
                head = node;
            }
            size++;
            return node;
        }

        public DoublyLinkedListNode updateHead(DoublyLinkedListNode node){
            if(isEmpty()){
                throw new RuntimeException("list is empty");
            }
          return  addFirst(node.key,node.value);
        }

        public boolean isEmpty(){
            return size() == 0;
        }
        public int size(){
            return size;
        }

    }
    static class DoublyLinkedListNode {
        String key;
        int value;
        DoublyLinkedListNode next = null;
        DoublyLinkedListNode prev = null;

        public DoublyLinkedListNode(String key,int value,DoublyLinkedListNode next,DoublyLinkedListNode prev){
            this.key = key;
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
