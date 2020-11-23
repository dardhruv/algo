package com.dhruv.binarytree;

import com.dhruv.tree.TreeNode;
import sun.reflect.generics.tree.Tree;

public class CousinsBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
            ;
            this.left = null;
            this.right = null;
        }
    }

    TreeNode xParent = null;
    TreeNode yParent = null;
    int xDepth = -1;
    int yDepth = -1;

public boolean isCousins(TreeNode root,int x,int y){
getDepthAndParent(root,x,y,0,null);
return xParent != yParent && xDepth == yDepth;
    }
public void getDepthAndParent(TreeNode root,int x,int y,int depth,TreeNode parent){
    if(root == null)
        return;

    if(root.val == x){
        xParent = parent;
        xDepth = depth;
    }else if (root.val == y){
    yParent = parent;
    yDepth = depth;
    }else{
        getDepthAndParent(root.left,x,y,depth+1,root);
        getDepthAndParent(root.right,x,y,depth+1,root);
    }
}

}