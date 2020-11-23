package com.dhruv.binarytree;

public class MaxDepth {

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val ){
            this.val = val;
        }
    }

    int maxDepth = -1;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode childLeft = new TreeNode(1);
        TreeNode childRight = new TreeNode(1);
        root.left = childLeft;
        root.right = childRight;
        TreeNode rightChild2 = new TreeNode(1);
        TreeNode rightChild3 = new TreeNode(1);
        TreeNode rightChild4 = new TreeNode(1);
        TreeNode rightChild5 = new TreeNode(1);
        root.right.right = rightChild2;
        rightChild2.right = rightChild3;
        rightChild3.right = rightChild4;
        rightChild4.right = rightChild5;
        System.out.println(new MaxDepth().calcMaxDeoth(root));

    }

    public int calcMaxDeoth(TreeNode root){
        if(root == null){
            return 0;
        }
        maxDepthHelper(root,0);
        return maxDepth;
    }

    public void maxDepthHelper(TreeNode root,int depth){
        if(root == null)
            return;
        if(depth > maxDepth)
            maxDepth = depth;
        if(root.left != null){
            maxDepthHelper(root.left,depth+1);
        }
        if(root.right != null){
            maxDepthHelper(root.right,depth+1);
        }
    }


}
