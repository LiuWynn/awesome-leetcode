/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 * 
 * √ Your runtime beats 85.65 % of java submissions
 * √ Your memory usage beats 77.8 % of java submissions (34.7 MB)
 */
class Solution {
    public int reverse(int x) {
        long reverseX = 0;
        while ((x / 10) != 0) {
            reverseX = reverseX * 10 + (x % 10) * 10;
            x = x / 10;
        }
        reverseX += x;
        return (reverseX > Integer.MAX_VALUE || reverseX < Integer.MIN_VALUE) ? 0 : (int) reverseX;
    }
}
