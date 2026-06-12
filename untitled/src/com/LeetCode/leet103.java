package com.LeetCode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class leet103 {

    // Definition for a binary tree node.
    static class TreeNode {
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

        private static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();

            if (root == null) {
                return result;
            }

            Deque<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            boolean reverse = false;

            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                List<Integer> currentLevel = new ArrayList<>();

                for (int i = 0; i < levelSize; i++) {

                    if (!reverse) {
                        TreeNode current = queue.pollFirst();
                        currentLevel.add(current.val);

                        if (current.left != null) {
                            queue.offerLast(current.left);
                        }

                        if (current.right != null) {
                            queue.offerLast(current.right);
                        }

                    } else {
                        TreeNode current = queue.pollLast();
                        currentLevel.add(current.val);

                        if (current.right != null) {
                            queue.offerFirst(current.right);
                        }

                        if (current.left != null) {
                            queue.offerFirst(current.left);
                        }
                    }
                }

                result.add(currentLevel);
                reverse = !reverse;
            }

            return result;
        }




        public static void main(String[] args) {

        /*
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7

        Zigzag Level Order:
        [[1], [3, 2], [4, 5, 6, 7]]
        */

            TreeNode root = new TreeNode(
                    1,
                    new TreeNode(
                            2,
                            new TreeNode(4),
                            new TreeNode(5)
                    ),
                    new TreeNode(
                            3,
                            new TreeNode(6),
                            new TreeNode(7)
                    )
            );

            leet103 sol = new leet103();

            List<List<Integer>> ans = sol.zigzagLevelOrder(root);

            System.out.println(ans);
        }
    }

