/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 * 解题思路：
 * 题目要求空间复杂度为 O(1)，
 * 所以就采取逐步交换元素的方法
 * 
 * √ Your runtime beats 34.9 % of java submissions
 * √ Your memory usage beats 95.45 % of java submissions (36.4 MB)
 */
class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        for (int i = 0; i < k; i++) { // 外层循环控制向右移动多少位数
            int tail = nums[len - 1]; // 保留末尾元素
            for (int j = len - 2; j > -1; j--) { // 内层循环控制数组中元素向右移动一位
                nums[j + 1] = nums[j];
            }
            nums[0] = tail; // 每次循环结束，末尾元素覆盖第一个元素，整体完成右移
        }
    }
}
