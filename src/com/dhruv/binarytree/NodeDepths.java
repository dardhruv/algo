package com.dhruv.binarytree;

import java.util.ArrayList;
import java.util.List;

public class NodeDepths {

    public static void main(String[] args) {
    BinaryTree tree = new BinaryTree(1);
    tree.left = new BinaryTree(2);

    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static int nodeDepths(BinaryTree root){
        int finalAnswer = 0;
        List<Integer> depths = new ArrayList<>();
        List<Integer> result = calculateNodeDepths(root,0,depths);
        for(int depth:result){
            finalAnswer += depth;
        }
        return finalAnswer;
    }

    public static List<Integer> calculateNodeDepths(BinaryTree node, int sum, List<Integer> depths){
        if(node == null)
            return null;
        depths.add(sum);
        calculateNodeDepths(node.left,sum+1,depths);
        calculateNodeDepths(node.right,sum+1,depths);
        return depths;
    }


}
