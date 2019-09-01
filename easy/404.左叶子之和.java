/*
 * @lc app=leetcode.cn id=404 lang=java
 *
 * [404] 左叶子之和
 * 
 * √ Your runtime beats 97.65 % of java submissions
 * √ Your memory usage beats 79.79 % of java submissions (34.9 MB)
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left != null && root.left.left == null && root.left.right == null)
            return root.left.val + sumOfLeftLeaves(root.right);
        else
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);

    }
}
