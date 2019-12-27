/*
 * @lc app=leetcode.cn id=303 lang=java
 *
 * [303] 区域和检索 - 数组不可变
 * Your runtime beats 69.58 % of java submissions
 * Your memory usage beats 82.05 % of java submissions (43.8 MB)
 */

// @lc code=start
class NumArray {

    int[] dp;

    public NumArray(int[] nums) {
        // 声明nums.length+1的空间
        dp = new int[nums.length + 1];
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            // nums: [-2, 0, 3, -5, 2, -1]
            // dp: [0, -2, -2, 1, -4, -2, -3]
            dp[i] += dp[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return dp[j + 1] - dp[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such: NumArray obj =
 * new NumArray(nums); int param_1 = obj.sumRange(i,j);
 */
// @lc code=end
