package com.dhruv.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

    private int data;
    private List<TreeNode> children;

    protected TreeNode(int data){
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }
}
