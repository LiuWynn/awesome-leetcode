/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 * 解题思路：
 * 1. 对给定数组进行遍历，设最大子序列和为 sum，初值为 0, 结果为 ans， 初值为 nums[0];
 * 2. 如果 sum >0，则说明对结果有增益，此时 sum 原基础上加上 当前遍历数值；
 * 3. 否则，把当前遍历数 赋值给 sum；
 * 4. 每次比较 sum 和 ans 的大小，将最大值赋值给 ans，遍历结果返回输出
 * 
 * √ Your runtime beats 58.36 % of java submissions
 * √ Your memory usage beats 91.17 % of java submissions (37.3 MB)
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(sum, ans);
        }
        return ans;
    }
}
