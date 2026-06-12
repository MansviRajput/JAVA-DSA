package com.Tree;


import java.util.LinkedList;
import java.util.Queue;

public class findSuccessor {

    public static void main(String[] args) {

        findSuccessor tree = new findSuccessor();

        TreeNode root = tree.new TreeNode(12);

        root.left = tree.new TreeNode(7);
        root.right = tree.new TreeNode(1);

        root.left.left = tree.new TreeNode(9);

        root.right.left = tree.new TreeNode(10);
        root.right.right = tree.new TreeNode(5);

        TreeNode result = tree.findSuccessor(root, 1);

        if (result != null) {
            System.out.println("Successor: " + result.val);
        } else {
            System.out.println("No successor found");
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode findSuccessor(TreeNode root,int key) {
        if(root == null) return null;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while(!queue.isEmpty()){
                TreeNode node = queue.poll();
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                if(node.val == key){
                    break;
                }
        }
        return queue.peek();
    }
}
