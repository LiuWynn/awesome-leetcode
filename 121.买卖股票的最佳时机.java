/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 * 解题思路：
 * 双重循环，对数组中两两元素进行比较（后-前），求差值，找出差值中的最大值
 * 
 * √ Your runtime beats 5 % of java submissions
 * √ Your memory usage beats 17.36 % of java submissions (40 MB)
 */
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null)
            return 0;
        int len = prices.length;
        int profit = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                profit = (prices[j] - prices[i] > profit) ? (prices[j] - prices[i]) : profit;
            }
        }
        return profit;
    }
}
