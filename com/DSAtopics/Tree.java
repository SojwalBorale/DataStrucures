package com.DSAtopics;

import java.util.Scanner;
public class Tree {
      class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    Node create(){
          int data;
          Scanner sc = new Scanner(System.in);
          Node root = null;
        System.out.println("Enter the value:");
        data = sc.nextInt();
        if (data==-1){
            return null;
        }
        root = new Node(data);
        System.out.println("Enter the left node to"+root.data);
        root.left=create();
        System.out.println("Enter the right node to"+root.data);
        root.right=create();
        return root;
    }
   static void inorder(Node root){
          if (root==null){
              return;
          }
          inorder(root.left);
       System.out.print(root.data);
       inorder(root.right);
   }
   static void preorder(Node root){
          if (root==null){
              return;
          }
       System.out.print(root.data);
       preorder(root.left);
       preorder(root.right);
   }
   static void postorder(Node root){
          if (root==null){
              return;
          }
          postorder(root.left);
          postorder(root.right);
       System.out.print(root.data);
   }
    public static void main(String[] args) {
          Tree tree = new Tree();
          Node root = tree.create();
          inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }
}
