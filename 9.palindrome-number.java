/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 *
 * https://leetcode.com/problems/palindrome-number/description/
 *
 * algorithms
 * Easy (42.60%)
 * Total Accepted:    544.2K
 * Total Submissions: 1.3M
 * Testcase Example:  '121'
 *
 * Determine whether an integer is a palindrome. An integer is a palindrome
 * when it reads the same backward as forward.
 * 
 * Example 1:
 * 
 * 
 * Input: 121
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it
 * becomes 121-. Therefore it is not a palindrome.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a
 * palindrome.
 * 
 * 
 * Follow up:
 * 
 * Coud you solve it without converting the integer to a string?
 * 
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        // 1. 反转数字，参照[7]Reverse Integer
        // 2. 与原数字进行比较
        // 2.1 相等，返回true
        // 2.2 不等，返回false
        int copyX = x;
        int reverseX = 0;
        while ((copyX / 10) > 0) { // 根据数字大小给定循环次数
            reverseX = reverseX * 10 + (copyX % 10) * 10;
            copyX /= 10;
        }
        return (copyX + reverseX) == x;
    }
}
