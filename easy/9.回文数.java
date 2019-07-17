/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
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
