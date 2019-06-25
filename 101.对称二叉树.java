/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
 * 解题思路：关于树的问题，大部分都能用递归解决，这题也是一样，
 * 由于要比较两个节点间的大小关系，所以我们需要重新定义一个满足我们要求的函数
 * 1. 如果根节点为空，肯定满足条件，返回 true
 * 2. 如果根节点不为空，则把左节点的左节点和右节点的右节点 & 左节点的右节点和右节点的左节点进行比较，
 * 直至递归结束返回结果
 * 
 * √ Your runtime beats 85.66 % of java submissions
 * √ Your memory usage beats 80.14 % of java submissions (35.6 MB)
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isSymmetricHelp(root.left, root.right);
    }

    private boolean isSymmetricHelp(TreeNode left, TreeNode right) {
        // 比较的两个节点至少有一个为空时
        if (left == null || right == null)
            return left == right;
        // 都不会为空
        if (left.val != right.val)
            return false;
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }
}

// class TreeNode {
// int val;
// TreeNode left;
// TreeNode right;

// TreeNode(int x) {
// val = x;
// }
// }
