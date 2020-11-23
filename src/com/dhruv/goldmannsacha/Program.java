package com.dhruv.goldmannsacha;

import java.util.HashMap;
import java.util.Map;

public class Program {

    static class TrieNode {
        Map<Character,TrieNode> children = new HashMap<Character,TrieNode>();
    }

    static class SuffixTrie {
        TrieNode root = new TrieNode();
        char endSymbol = '*';

        public  SuffixTrie(String str) {
            populateSuffixTrieFrom(str);
        }

        public void populateSuffixTrieFrom(String str){
            int i=0;
            TrieNode current = root;
            while(i < str.length() -1){
                insertSubstringStartingAt(i,str);
                i++;
            }
        }

        private void insertSubstringStartingAt(int i,String str){
                TrieNode currentNode = root;
                for(int j=i; j<str.length(); j++){
                    Character letter = str.charAt(j);
                    if(!currentNode.children.containsKey(letter)){
                        currentNode.children.put(letter,new TrieNode());
                    }
                    currentNode = currentNode.children.get(letter);
                }
                currentNode.children.put(endSymbol,null);
        }

        public boolean contains(String str){
            TrieNode node = root;
            for(int i=0; i<str.length(); i++){
                if(!node.children.containsKey(str.charAt(i))){
                    return false;
                }
                node = node.children.get(str.charAt(i));
            }
            return node.children.containsKey(endSymbol);
        }
    }
}
