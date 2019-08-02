/*
 * @lc app=leetcode.cn id=235 lang=java
 *
 * [235] 二叉搜索树的最近公共祖先
 * 解题思路：
 * 利用二叉搜索树的特点，如果p、q的值都小于root，说明p q 肯定在root的左子树中；
 * 如果p q都大于root，说明肯定在root的右子树中；
 * 如果一个在左一个在右 则说明此时的root记为对应的最近公共祖先 
 * 
 * √ Your runtime beats 72.29 % of java submissions
 * √ Your memory usage beats 37.9 % of java submissions (40.4 MB)
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ((root.val > p.val) && (root.val > q.val)) // 说明 p q在 root 左边
            return lowestCommonAncestor(root.left, p, q);

        if ((root.val < p.val) && (root.val < q.val)) // 说明 p q在 root 左边
            return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}
