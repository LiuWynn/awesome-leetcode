/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 
 * √ Your runtime beats 89.48 % of java submissions
 * √ Your memory usage beats 39.07 % of java submissions (34.5 MB)
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        // 递归结束条件
        if (root == null)
            return null;
        // 先保存左子树的节点数据
        TreeNode tmp = root.left;
        // 把右节点换给左节点
        root.left = invertTree(root.right);
        // 左节点换给右节点
        root.right = invertTree(tmp);
        return root;
    }

}
