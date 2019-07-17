import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=108 lang=java
 *
 * [108] 将有序数组转换为二叉搜索树
 * 解题思路：
 * 因为给定的是有序数组，
 * 所以可以通过递归查找左右两边中位数作为当前节点的左右节点
 * 
 * √ Your runtime beats 75.15 % of java submissions
 * √ Your memory usage beats 98.89 % of java submissions (36.2 MB)
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0)
            return null;
        int middleIndex = nums.length / 2;
        // 构造根节点
        TreeNode root = new TreeNode(nums[middleIndex]);
        BSTHelper(root, nums);
        return root;
    }

    public void BSTHelper(TreeNode root, int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        // 1. 把传入的数组以 middleIndex 为界，分两半
        int len = nums.length;
        int middleIndex = len / 2;
        int[] leftNums = Arrays.copyOfRange(nums, 0, middleIndex);
        int[] rightNums = Arrays.copyOfRange(nums, middleIndex + 1, len);
        // 计算左边数组中位数，如果为空，则赋值null
        root.left = (leftNums == null || leftNums.length == 0) ? null : new TreeNode(leftNums[leftNums.length / 2]);
        // 计算右边数组中位数，如果为空。则赋值null
        root.right = (rightNums == null || rightNums.length == 0) ? null
                : new TreeNode(rightNums[rightNums.length / 2]);
        BSTHelper(root.left, leftNums);
        BSTHelper(root.right, rightNums);
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
