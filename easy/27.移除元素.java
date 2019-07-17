/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 * 
 * √ Your runtime beats 99.43 % of java submissions
 * √ Your memory usage beats 87.39 % of java submissions (35 MB)
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        if (len == 0)
            return 0;
        int tail = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != val) {
                nums[tail++] = nums[i];
            }
        }
        return tail;
    }
}
