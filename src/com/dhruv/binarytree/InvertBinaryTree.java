package com.dhruv.binarytree;

public class InvertBinaryTree {

    static class BinaryTree{

        int value;
        BinaryTree left;
        BinaryTree right;
        BinaryTree(int value){
            this.value = value;
            left = null;
            right = null;
        }
    }

    public static void invertBinaryTree(BinaryTree tree) {
        if(tree == null) return;

        BinaryTree temp = tree.left;
        tree.left = tree.right;
        tree.right = temp;
        invertBinaryTree(tree.left);
        invertBinaryTree(tree.right);
    }
}
