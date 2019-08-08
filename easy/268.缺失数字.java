/*
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 缺失数字
 * 
 * √ Your runtime beats 94.02 % of java submissions
 * √ Your memory usage beats 28.27 % of java submissions (48.8 MB)
 */
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return nums.length * (nums.length + 1) / 2 - sum;
    }
}
