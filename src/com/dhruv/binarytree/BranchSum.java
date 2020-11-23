package com.dhruv.binarytree;

import com.sun.xml.internal.org.jvnet.mimepull.CleanUpExecutorFactory;

import java.util.ArrayList;
import java.util.List;

public class BranchSum {

    public static void main(String[] args) {

    }

    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value){
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public static List<Integer> branchSums(BinaryTree root,int sum){


            return new ArrayList<Integer>();
        }

       private static List<Integer> calculateBranchSums(BinaryTree node,int runningSum,List<Integer> sums){
            if(node == null)
                return null;
            runningSum += runningSum + node.value;
            if(node.left == null && node.right == null){
                sums.add(runningSum);
            }
            calculateBranchSums(node.left,runningSum,sums);
            calculateBranchSums(node.right,runningSum,sums);
            return sums;
       }

    }
}
