package org.example.leetcode.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode () {}
        public TreeNode (int val) {
            this.val = val;
        }
        public TreeNode (int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution{
        public List<List<Integer>> LevelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            Queue<TreeNode> queue = new ArrayDeque<>();
            if (root != null) queue.add(root);
            while (! queue.isEmpty()) {
                List<Integer> level = new ArrayList<>();
                int n = queue.size();
                for (int i=0; i<n; i++) {
                    TreeNode node = queue.poll();
                    level.add(node.val);
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
                res.add(level);
            }
            return res;
        }
    }
}
