/*
 * @lc app=leetcode.cn id=64 lang=java
 *
 * [64] 最小路径和
 */

// @lc code=start
class Solution {
    /**
     * 动态规划思路实现
     */
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        return minPathSum(grid, m, n);
    }

    public int minPathSum(int[][] grid, int m, int n) {
        // 声明一个动规数组
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    // 如果是grid[0][0]
                    dp[0][0] = grid[i][j];
                } else if (i == 0) {
                    // 如果是第一排，则肯定是当前下标元素+左边一个元素
                    dp[0][j] = grid[i][j] + dp[i][j - 1];
                } else if (j == 0) {
                    // 如果是第一列，则肯定是当前下标元素+上边一个元素
                    dp[i][0] = grid[i][j] + dp[i - 1][j];
                } else {
                    // 既不是第一排，也不是第一列，
                    // 则肯定是（当前元素+左边元素）、（当前元素+上边元素）的最小值
                    dp[i][j] = grid[i][j] + Math.min(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
// @lc code=end
