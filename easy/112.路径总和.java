import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
 * 
 * √ Your runtime beats 6.16 % of java submissions
 * √ Your memory usage beats 35.6 % of java submissions (38.6 MB)
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    // 申明链表来记录所有路径和
    private List<Integer> resultList = new ArrayList<>();

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        pathSumList(root, root.val);
        for (Integer result : resultList) {
            if (result == sum)
                return true;
        }
        return false;
    }

    /*
     * 递归计算二叉树的所有路径和
     */
    public void pathSumList(TreeNode root, int val) {
        if (root.left == null && root.right == null) { // 当遍历到叶子节点时，添加路径和
            resultList.add(val);
            return;
        }
        if (root.left != null)
            pathSumList(root.left, val + root.left.val);
        if (root.right != null)
            pathSumList(root.right, val + root.right.val);
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
