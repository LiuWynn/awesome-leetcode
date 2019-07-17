/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 * √ Your runtime beats 95.08 % of java submissions
 * √ Your memory usage beats 84.92 % of java submissions (37.6 MB)
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target || nums[i] == target)
                return i;
        }
        return nums.length;
    }
}
