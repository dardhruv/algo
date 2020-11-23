package com.dhruv.binarytree;

import java.util.ArrayDeque;
import java.util.Queue;

public class MinDepth {

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {
        Queue<TreeNode> pendingNodes = new ArrayDeque<>();
        pendingNodes.offer(root);
        int depth = 1;
        while(!pendingNodes.isEmpty()){
            for(int i=0; i<pendingNodes.size(); i++){
                TreeNode node = pendingNodes.poll();
                // because the problem asks for the minimum depth of the binary tree so we shouldimplement bfs
                // and we dont need to traverse the entire tree as we are doing breadth first approach
                if(node.left == null && node.right == null) return depth;
                if(node.left != null) pendingNodes.offer(node.left);
                if(node.right != null) pendingNodes.offer(node.right);
            }
            depth++;
        }
        return 0;
    }
}
