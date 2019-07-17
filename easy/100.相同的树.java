/*
 * @lc app=leetcode.cn id=100 lang=java
 *
 * [100] 相同的树
 * 解题思路：递归
 * 1. 如果 p 和 q 的左右子树节点具有相同的值，则 判断左右子树的左右子树是否相同，直到遍历到叶子节点
 * 2. 否则，返回false
 * 
 * √ Your runtime beats 87.63 % of java submissions
 * √ Your memory usage beats 81.4 % of java submissions (34.5 MB)
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
