package com.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
public class SearchingPathInArrayUsingTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);

        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(2);

        int[] arr = {1, 0, 6};

        SearchingPathInArrayUsingTree obj = new SearchingPathInArrayUsingTree();

        System.out.println(obj.findPathInArrayUsingTree(root, arr));
    }

    public boolean findPathInArrayUsingTree(TreeNode root,int[] arr) {
        if (root == null) {
            return arr.length == 0;
        }
        return helper(root,arr,0);
    }

    private boolean helper(TreeNode node,int[] arr,int index){
        if (node == null) {
            return false;
        }
        if(index >=  arr.length || arr[index] != node.val) {
            return false;
        }
        if(node.left == null && node.right == null && index == arr.length -1){
            return true;
        }
        return helper(node.left,arr,index+1) || helper(node.right,arr,index+1);
    }
}
