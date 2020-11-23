package com.dhruv.goldmannsacha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IsSubsequence {

    String source,target;
    Integer leftBound,rightBound;


    public static void main(String[] args) {
        //System.out.println(new IsSubsequence().isSubsequence("abc","abc"));
        System.out.println(new IsSubsequence().isSubsequenceFollowUp("abc","adddbxxc"));
    }


//    public static boolean isSubsequence(String s, String t) {
//        if(s.length() == t.length() )
//            return s==t;
//        if(t.length() < s.length()) return false;
//        int j = 0;
//        for(int i=0; i<s.length();i++){
//            while(j < t.length() && t.charAt(j) != s.charAt(i))
//                j++;
//            if(j == t.length()-1 && i < s.length()-1)
//                return false;
//        }
//        return true;
//    }


    private boolean rec_isSubsequence(int leftindex,int rightIndex){
        if(leftindex == leftBound)
            return true;
        if(rightIndex == rightBound)
            return false;

        if(source.charAt(leftindex) == target.charAt(rightIndex))
            ++leftindex;
        ++rightIndex;
        return rec_isSubsequence(leftindex,rightIndex);
    }
    public boolean isSubsequence(String s,String t){
        this.source = s;
        this.target = t;
        this.leftBound = s.length();
        this.rightBound = t.length();

        return rec_isSubsequence(0,0);
    }

    private boolean isSubsequenceIterative(String s,String t){
        Integer leftBound = s.length();
        Integer rightBound = t.length();
        Integer pLeft = 0,pRight = 0;
        while(pLeft < leftBound && pRight < rightBound){
            if(s.charAt(pLeft) == t.charAt(pRight))
                pLeft++;
            pRight++;
        }
        return pLeft == leftBound;
    }

    private boolean isSubsequenceFollowUp(String s,String t){
        HashMap<Character, List<Integer>> letterIndicesTable = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            if(letterIndicesTable.containsKey(t.charAt(i)))
                letterIndicesTable.get(t.charAt(i)).add(i);
            else{
                ArrayList<Integer> indices = new ArrayList<>();
                indices.add(i);
                letterIndicesTable.put(t.charAt(i),indices);
            }
        }
        Integer currMatchIndex = -1;
        for (char letter : s.toCharArray()) {
            if (!letterIndicesTable.containsKey(letter))
                return false; // no match, early exist

            boolean isMatched = false;
            // greedy match with linear search
            for (Integer matchIndex : letterIndicesTable.get(letter)) {
                if (currMatchIndex < matchIndex) {
                    currMatchIndex = matchIndex;
                    isMatched = true;
                    break;
                }
            }

            if (!isMatched)
                return false;
        }

        // consume all characters in the source string
        return true;
    }
}
