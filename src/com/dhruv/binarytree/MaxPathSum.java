package com.dhruv.binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxPathSum {

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value){
            this.value = value;
        }
    }

    public static int maxPathSum(BinaryTree tree){
        List<Integer> maxPathSum = findMaxSum(tree);
        return maxPathSum.get(1);
    }

    public static List<Integer> findMaxSum(BinaryTree tree){
        if(tree == null){
            return new ArrayList<Integer>(Arrays.asList(0,Integer.MIN_VALUE));
        }
        List<Integer> leftMaxSumArray = findMaxSum(tree.left);
        Integer leftMaxSumAsBranch = leftMaxSumArray.get(0);
        Integer leftMaxPathSum = leftMaxSumArray.get(1);

        List<Integer> rightMaxSumArray = findMaxSum(tree.right);
        Integer rightMaxSumAsBranch = rightMaxSumArray.get(0);
        Integer rightMaxPathSum = rightMaxSumArray.get(1);

        Integer maxChildSumAsBranch = Math.max(leftMaxSumAsBranch,rightMaxSumAsBranch);
        Integer maxSumAsBranch = Math.max(maxChildSumAsBranch+tree.value,tree.value);
        Integer maxSumAsRootNode = Math.max(maxSumAsBranch,leftMaxSumAsBranch+tree.value+rightMaxSumAsBranch);
        Integer maxPathSum = Math.max(maxSumAsRootNode,Math.max(leftMaxPathSum,rightMaxPathSum));
        return new ArrayList<>(Arrays.asList(maxSumAsBranch,maxPathSum));
    }


}
