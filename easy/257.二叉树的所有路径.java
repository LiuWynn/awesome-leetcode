import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
 * 解题思路：模仿第112题：路径总和
 * 通过此题应该学到遍历二叉树所有路径的方法
 * 
 * √ Your runtime beats 57.04 % of java submissions
 * √ Your memory usage beats 96.88 % of java submissions (37 MB)
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    private List<String> paths = new ArrayList<String>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            // 节点为null时直接return null报错
            // 测试用例有问题
            return paths;
        }
        binaryTreePathsHelper(root, "" + root.val);
        return paths;
    }

    private void binaryTreePathsHelper(TreeNode root, String path) {
        if (root.left == null && root.right == null) {
            paths.add(path);
            return;
        }
        if (root.left != null)
            binaryTreePathsHelper(root.left, path + "->" + root.left.val);
        if (root.right != null)
            binaryTreePathsHelper(root.right, path + "->" + root.right.val);
    }

}
