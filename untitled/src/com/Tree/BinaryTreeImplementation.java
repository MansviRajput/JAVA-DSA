package com.Tree;

import java.util.Scanner;

public class BinaryTreeImplementation {

    public BinaryTreeImplementation() {

    }
    private static class  Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public void populte(Scanner sc){
        System.out.println("Enter the root Node: ");
        int data = sc.nextInt();
        root = new Node(data);
        populate(sc,root);
    }

    private void populate(Scanner sc, Node node){
        if(node == null){
            return;
        }
        System.out.println("Do you want to enter the left of: " + node.data);
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("Enter the left child: " + node.data);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc,node.left);
        }
        System.out.println("Do you want to enter the right of: " + node.data);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the right child: " + node.data);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc,node.right);
        }
    }

    public void display(){
        display(root,"");
    }

    private void display(Node root, String indent){
        if(root == null){
            return;
        }
        System.out.println(indent + root.data + " ");
        display(root.left,indent + "\t");
        display(root.right,indent + "\t");
    }

    public void prettyDisplay(){
        preetyDisplay(root,0);
    }
    private void preetyDisplay(Node root, int level){
        if(root == null){
            return;
        }
        preetyDisplay(root.right,level+1);
        if(level != 0){
            for(int i = 0; i < level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------------->" + root.data);
        }else{
            System.out.println(root.data);
        }
        preetyDisplay(root.left,level+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeImplementation bt = new BinaryTreeImplementation();
        bt.populte(sc);
        bt.display();
        bt.prettyDisplay();
    }


}
