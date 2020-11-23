package com.dhruv.tree;

import sun.reflect.generics.tree.Tree;

import java.util.Scanner;

public class TreeNodeUse {

    private static TreeNode root;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        TreeNode root = takeInput();
        printTree(root);
    }

    private static TreeNode takeInput(){
        TreeNode root = null;
        int data;
        System.out.println("Enter data");
        data = sc.nextInt();
        root = new TreeNode(data);
        int n;
        System.out.println("Enter number of children");
        n = sc.nextInt();
        for(int i=0; i<n; i++){
           TreeNode child = takeInput();
           root.getChildren().add(child);
        }
            return root;
    }

    private static void printTree(TreeNode root){
        if(root == null)
            return;
        System.out.print(root.getData());
        System.out.print(":");
        for(int i=0; i<root.getChildren().size(); i++){
            System.out.print(root.getChildren().get(i).getData());
        }
        System.out.println("\n");
        for(int i=0; i<root.getChildren().size() ;i++){
            printTree(root.getChildren().get(i));
        }
    }

    private static void printNodesAtLevelK(TreeNode root,int k){
        if(root == null) return;
        if(k == 0) {
            System.out.println(root.getData());
        }

        for(int i=0; i< root.getChildren().size(); i++){
            printNodesAtLevelK(root.getChildren().get(i),k-1);
        }
    }

    private static int getAllLeafNodes(TreeNode root,int result){
        if(root.getChildren().size() == 0){
            return 1;
        }
        for(int i=0; i<root.getChildren().size(); i++){
                result += getAllLeafNodes(root.getChildren().get(i),result);
        }
        return result;
    }

   // private static BinaryTreeNode takeInputLevelWise(Bina)
}
