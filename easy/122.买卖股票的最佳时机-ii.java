/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 * 
 * √ Your runtime beats 7.06 % of java submissions
 * √ Your memory usage beats 26.87 % of java submissions (38.8 MB)
 */
class Solution {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        int buy = prices[0], sell = 0, delta = 0;
        int len = prices.length;
        boolean isBuy = true, isSell = false;
        for (int i = 1; i < len; i++) { // 确定买入点
            int sellPos = 0; // 记录卖出点的下标
            int buyPos = 0; // 记录买入点下标
            if (prices[i] > buy && (i + 1 == len || prices[i + 1] < prices[i])) { // 卖出点
                sell = prices[i]; // 卖出点首先要比买入点大，并且是连续可卖出点中的最大
                sellPos = i;
                isSell = true;
            }
            // 这里判断逻辑写的不是很清楚
            if (prices[i] < buy || (prices[i] < sell && i > sellPos && isBuy == false)) { // 买入点
                // 有两种可能会使 买入点 变化
                // 1. 买入点后新的值比它小
                // 2. 卖出以后寻找新的买入点 （要求： 新的买入点比卖出小 && 新的买入点下标比上一次卖出大 && 刚交易完还没有购买新股）
                buy = prices[i];
                buyPos = i;
                isBuy = true;
            }
            if (isBuy && isSell && (sellPos > buyPos)) {
                delta += (sell - buy);
                isBuy = isSell = false;
            }
        }
        return delta;
    }
}
