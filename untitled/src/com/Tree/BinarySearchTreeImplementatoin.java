package com.Tree;

import java.util.Scanner;

public class BinarySearchTreeImplementatoin {
    public BinarySearchTreeImplementatoin(){

    }

    public static void main(String[] args) {
        BinarySearchTreeImplementatoin bt = new BinarySearchTreeImplementatoin();
        int[] nums = {10,5,2,15,12,25,21,19,20};
        bt.populate(nums);
        bt.display();
        System.out.println(bt.balanced(bt.root));
        bt.preorder(bt.root);
        System.out.println();
        bt.inorder(bt.root);
        System.out.println();
        bt.postorder(bt.root);
    }

    public void populate(int[] nums){
        for(int i =0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }

    private static class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private Node root;

    public int height(Node root){
        if(root == null){
            return -1;
        }
        return root.height;
    }

    public Boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(value,root);
    }

    private Node insert(int value, Node root){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(value < root.value){
            root.left = insert(value,root.left);
        }
        if(value > root.value){
            root.right = insert(value,root.right);
        }

        root.height = Math.max(height(root.left), height(root.right)) + 1;
        return root;
    }

    public boolean balanced(Node root){
        if(root == null){
            return true;
        }
        return Math.abs(height(root.left) - height(root.right)) <= 1 && balanced(root.left) && balanced(root.right);
    }

    public void display(){
        display(root,"Root Node : ");
    }
    private void display(Node root,String details){
        if(root == null){
            return;
        }
        System.out.println(details + root.value);
        display(root.left,"Left child of "+root.value + " : ");
        display(root.right,"Right child of "+root.value + " : ");
    }

    public void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.value + ",");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.value + ",");
        inorder(root.right);
    }

    public void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + ",");
    }
}
