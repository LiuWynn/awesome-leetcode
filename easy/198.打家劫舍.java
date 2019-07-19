/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 * 解题思路：想的太简单了，做起来发现简单题不简单
 * 假设 f(-1)=0; f(0)=0, 给定数组nums中元素用 A(i)表示
 * 若给定数组[2, 7, 9, 3, 1]
 * f(1) = max(f(-1) + A1, f(0)); // 2
 * f(2) = max(f(0) + A2, f(1));  // 7
 * f(3) = max(f(1) + A3, f(2));  // 11
 * f(4) = max(f(2) + A4, f(3));  // 11
 * f(5) = max(f(3) + A5, f(4));  // 12
 * 
 * √ Your runtime beats 96.21 % of java submissions
 * √ Your memory usage beats 90.56 % of java submissions (33.9 MB)
 */
class Solution {
    public int rob(int[] nums) {
        int preSum = 0;
        int curSum = 0;
        for (int x : nums) {
            int tmp = curSum;
            curSum = Math.max(preSum + x, curSum);
            preSum = tmp;
        }
        return curSum;
    }
}
