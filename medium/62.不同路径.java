/*
 * @lc app=leetcode.cn id=62 lang=java
 *
 * [62] 不同路径
 * Your runtime beats 62.17 % of java submissions
 * Your memory usage beats 13.85 % of java submissions (33.3 MB)
 */

// @lc code=start
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    // 第一行第一列
                    dp[i][j] = 1;
                } else if (i == 0) {
                    // 第一行
                    dp[i][j] = dp[i][j - 1];
                } else if (j == 0) {
                    // 第一列
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // 既不是第一行，也不是第一列，左边+上边的和
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
// @lc code=end
