/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 *
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (25.23%)
 * Total Accepted:    649.2K
 * Total Submissions: 2.6M
 * Testcase Example:  '123'
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * 
 * Input: 123
 * Output: 321
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -123
 * Output: -321
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 120
 * Output: 21
 * 
 * 
 * Note:
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose
 * of this problem, assume that your function returns 0 when the reversed
 * integer overflows.
 * 
 */
/**
 * √ Accepted
 * √ 1032/1032 cases passed (1 ms)
 * √ Your runtime beats 100 % of java submissions
 * √ Your memory usage beats 100 % of java submissions (32.4 MB)
 */
class Solution {
    public int reverse(int x) {
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
            return 0;
        int copyX = x;   // 保存x
        long reverseX = 0;
        while ((copyX / 10) != 0) {
            reverseX = reverseX * 10 + (copyX % 10) * 10;
            copyX = copyX / 10;
        }
        reverseX += copyX;
        return (reverseX>Integer.MAX_VALUE || reverseX < Integer.MIN_VALUE) ? 0 : (int)reverseX;
    }
}

