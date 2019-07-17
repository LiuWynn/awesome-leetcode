import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层次遍历 II
 * 解题思路：
 * 1. 先根遍历二叉树
 * 2. 设置变量 level 记录每个节点所在层次，这样 就算不是逐层遍历，输出的结果也能保证正确
 * 
 * √ Your runtime beats 9.85 % of java submissions
 * √ Your memory usage beats 23.09 % of java submissions (37.8 MB)
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        levelOrderHelper(list, root, 0);
        System.out.println(list.toString());
        return list;
    }

    public void levelOrderHelper(List<List<Integer>> list, TreeNode root, int level) {
        if (root == null)
            return;
        if (level >= list.size())
            list.add(0, new ArrayList<Integer>()); // 每次遍历到下一层就先添加好 List 容器
        list.get(list.size() - level - 1).add(root.val);
        levelOrderHelper(list, root.left, level + 1);
        levelOrderHelper(list, root.right, level + 1);
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
